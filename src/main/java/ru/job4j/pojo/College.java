package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Ivanov");
        student.setName("Ivan");
        student.setPatronymic("Ivanovich");
        student.setGroup("A-111");
        student.setAdmission(new Date());

        System.out.println("Student: " + student.getSurname()
                + " " + student.getName() + " " + student.getPatronymic() + System.lineSeparator()
                + "Group: " + student.getGroup() + System.lineSeparator() + "Date admission: " + student.getAdmission());
    }
}
