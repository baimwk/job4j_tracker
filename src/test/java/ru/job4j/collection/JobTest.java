package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void whenCompareDescNames() {
        Comparator<Job> cmpName = new JobDescByName();
        int rsl = cmpName.compare(
                new Job("Analyst", 0),
                new Job("QA", 0)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompareAscNames() {
        Comparator<Job> cmpName = new JobAscByName();
        int rsl = cmpName.compare(
                new Job("Analyst", 0),
                new Job("QA", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompareAscNamesEqual() {
        Comparator<Job> cmpName = new JobAscByName();
        int rsl = cmpName.compare(
                new Job("Analyst", 10),
                new Job("Analyst", 10)
        );
        assertThat(rsl, is(0));
    }

    @Test
    public void whenCompareDescPriority() {
        Comparator<Job> cmpPriority = new JobDescByPriority();
        int rsl = cmpPriority.compare(
                new Job("QA", 1),
                new Job("QA", 5)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompareAscPriority() {
        Comparator<Job> cmpPriority = new JobAscByPriority();
        int rsl = cmpPriority.compare(
                new Job("QA", 1),
                new Job("QA", 5)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompareAscPriorityEquals() {
        Comparator<Job> cmpPriority = new JobAscByPriority();
        int rsl = cmpPriority.compare(
                new Job("Analyst", 5),
                new Job("QA", 5)
        );
        assertThat(rsl, is(0));
    }

    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}