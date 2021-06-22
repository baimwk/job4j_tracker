package ru.job4j.tracker;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ItemTest {
    @Test
    public void whenSort() {
        List<Item> items = Arrays.asList(
                new Item("a"),
                new Item("c"),
                new Item("b")
        );
        List<Item> itemsSorted = Arrays.asList(
                new Item("a"),
                new Item("b"),
                new Item("c")
        );
        Comparator sortByNameItemAsc = new SortByNameItemAsc();
        Collections.sort(items, sortByNameItemAsc);
        assertThat(items, is(itemsSorted));
    }

    @Test
    public void whenSort2() {
        List<Item> items = Arrays.asList(
                new Item(1, "a"),
                new Item(3, "c"),
                new Item(2, "b")
        );
        List<Item> itemsSorted = Arrays.asList(
                new Item(3, "c"),
                new Item(2, "b"),
                new Item(1, "a")
        );
        Comparator sortByNameItemDesc = new SortByNameItemDesc();
        Collections.sort(items, sortByNameItemDesc);
        assertThat(items, is(itemsSorted));
    }
}