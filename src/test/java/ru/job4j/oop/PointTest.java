package ru.job4j.oop;

import org.junit.Test;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void distanceAToBIs0() {
        Point a = new Point(5, 5);
        Point b = new Point(5, 5);
        double result = a.distance(b);
        assertThat(result, closeTo(0, 0.001));
    }

    @Test
    public void distanceAToBIs1() {
        Point a = new Point(5, 5);
        Point b = new Point(6, 5);
        double result = a.distance(b);
        assertThat(result, closeTo(1, 0.001));
    }
}