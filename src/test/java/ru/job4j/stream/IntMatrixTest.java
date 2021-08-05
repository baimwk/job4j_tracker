package ru.job4j.stream;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class IntMatrixTest {
    @Test
    public void whenMatrixToList() {
        Integer[][] matrix = { { 0, 1, 2 }, { 3, 4, 5 } };
        IntMatrix sc = new IntMatrix();
        List<Integer> rsl = sc.matrixToList(matrix);
        List<Integer> expected = List.of(0, 1, 2, 3, 4, 5);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenEmptyMatrixToList() {
        Integer[][] matrix = { {}, {} };
        IntMatrix sc = new IntMatrix();
        List<Integer> rsl = sc.matrixToList(matrix);
        List<Integer> expected = List.of();
        assertThat(rsl, is(expected));
    }
}