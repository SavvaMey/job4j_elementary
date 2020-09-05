package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new DirectJobSortName().thenComparing(new JobSortPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByNameAndProrityBySecondCheck() {
        Comparator<Job> cmpNamePriority = new DirectJobSortName().thenComparing(new JobSortPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameBackwards() {
        Comparator<Job> cmpNamePriority = new BackwardsJobSortName();
        int rsl = cmpNamePriority.compare(
                new Job("Lmpl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameDirect() {
        Comparator<Job> cmpNamePriority = new DirectJobSortName();
        int rsl = cmpNamePriority.compare(
                new Job("Lmpl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByPriorityDirect() {
        Comparator<Job> cmpNamePriority = new JobSortPriority();
        int rsl = cmpNamePriority.compare(
                new Job("Lmpl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByPriorityBackwards() {
        Comparator<Job> cmpNamePriority = new BackwardsJobSortPrority();
        int rsl = cmpNamePriority.compare(
                new Job("Lmpl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
}