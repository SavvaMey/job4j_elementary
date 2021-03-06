package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.collection.Departments;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.collection.Departments.sortAsc;

//push
public class DepartmentsTest {
    @Test
    public void whenMissed() {
        List<String> input = List.of("k1/sk1");
        List<String> expect = List.of("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> input = List.of("k1", "k1/sk1");
        List<String> expect = List.of("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNaturalSort() {
        List<String> input = Arrays.asList("k2", "k1", "k1/sk1");
        List<String> expect = List.of("k1", "k1/sk1", "k2");
        sortAsc(input);
        assertThat(input, is(expect));
    }
}