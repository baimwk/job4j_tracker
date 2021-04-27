package ru.job4j.ex;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class FactTest {
    @Test
    public void when3() {
        int rsl = Fact.calc(3);
        assertThat(rsl, is(6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenMinus1() {
        Fact.calc(-1);
    }
}