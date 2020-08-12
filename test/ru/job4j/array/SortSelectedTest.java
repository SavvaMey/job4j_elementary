package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortOne() {
        int[] input = new int[] {1, 100, 30};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 30, 100};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortTwo() {
        int[] input = new int[] {1, 100, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 1, 100};
        assertThat(result, is(expect));
    }
}