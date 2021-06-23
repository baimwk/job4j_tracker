package ru.job4j.collection;

import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void whenAsc() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Petr", 32));
        users.add(new User("Ivan", 31));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("Ivan", 31)));
        assertThat(it.next(), is(new User("Petr", 32)));
    }

    @Test
    public void whenCompareNames() {
        int rsl = new User("Petr", 32)
                .compareTo(
                        new User("Ivan", 32)
                );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompareAges() {
        int rsl = new User("Ivan", 30)
                .compareTo(
                        new User("Ivan", 32)
                );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompareEquals() {
        int rsl = new User("Ivan", 30)
                .compareTo(
                        new User("Ivan", 30)
                );
        assertThat(rsl, is(0));
    }
}