package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ValidateInputTest {
    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[] {"one", "1"});
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Test invalid");
        assertThat(selected, is(1));
    }

    @Test
    public void whenValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[] {"2"});
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Test valid");
        assertThat(selected, is(2));
    }

    @Test
    public void whenSomeValid() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[] {"2", "3"});
        ValidateInput input = new ValidateInput(out, in);
        int selected;
        selected = input.askInt("Test first Valid");
        assertThat(selected, is(2));
        selected = input.askInt("Test second Valid");
        assertThat(selected, is(3));

    }

    @Test
    public void whenMinusValid() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"-1"});
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Test minus");
        assertThat(selected, is(-1));
    }
}