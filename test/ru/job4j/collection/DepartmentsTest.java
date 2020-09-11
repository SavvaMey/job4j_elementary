package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static ru.job4j.collection.Departments.sortAsc;
import static ru.job4j.collection.Departments.sortDesc;
//push
public class DepartmentsTest {
    @Test
    public void whenMissed() {
        List<String> input = Arrays.asList("k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> input = Arrays.asList("k1", "k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNaturalSort() {
        List<String> input = Arrays.asList("k2", "k1", "k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1", "k2");
        sortAsc(input);
        assertThat(input, is(expect));
    }
}