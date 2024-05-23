package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.input.MockInput;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.output.StubOutput;
import static org.assertj.core.api.Assertions.assertThat;

class ValidateInputTest {

    @Test
    void whenInvalidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"one", "1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenValidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenValidInputAll() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"1", "2", "3"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selectedOne = input.askInt("Enter menu:");
        assertThat(selectedOne).isEqualTo(1);
        int selectedTwo = input.askInt("Enter menu:");
        assertThat(selectedTwo).isEqualTo(2);
        int selectedThree = input.askInt("Enter menu:");
        assertThat(selectedThree).isEqualTo(3);
    }

    @Test
    void whenValidInputIsNegativeNumber() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"one", "-1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-1);
    }
}