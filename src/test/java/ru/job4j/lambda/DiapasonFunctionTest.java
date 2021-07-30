package ru.job4j.lambda;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class DiapasonFunctionTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = DiapasonFunction.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSquareFunctionThenSquareResults() {
        List<Double> result = DiapasonFunction.diapason(5, 8, x -> x * x);
        List<Double> expected = Arrays.asList(25D, 36D, 49D);
        assertThat(result, is(expected));
    }

    @Test
    public void when2PowFunctionThen2PowResults() {
        List<Double> result = DiapasonFunction.diapason(1, 5, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(2D, 4D, 8D, 16D);
        assertThat(result, is(expected));
    }
}