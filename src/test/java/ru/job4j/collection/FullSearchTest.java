package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FullSearchTest {
    @Test
    public void extractNumber() {
        List<Task> tasks = Arrays.asList(
                new Task("1", "First desc"),
                new Task("2", "Second desc"),
                new Task("1", "First desc")
        );
        assertThat(FullSearch.extractNumber(tasks), is(Set.of("1", "2")));
    }

    @Test
    public void emptyNumber() {
        List<Task> tasks = Arrays.asList();
        assertThat(FullSearch.extractNumber(tasks), is(Set.of()));
    }
}