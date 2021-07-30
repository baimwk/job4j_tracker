package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class DiapasonFunction {
    public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> rsl = new ArrayList<>();
        for (double i = start; i < end; i++) {
            Double r = func.apply(i);
            rsl.add(r);
        }
        return rsl;
    }
}
