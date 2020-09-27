package ru.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.Multimax;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultimaxTest {

    @Test
    public void whenSecondMax() {
        int result = Multimax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = Multimax.max(7, 4, 2);
        assertThat(result, is(7));
    }

    @Test
    public void whenThirdMax() {
        int result = Multimax.max(7, 7, 10);
        assertThat(result, is(10));
    }

    @Test
    public void whenEqual() {
        int result = Multimax.max(10, 10, 10);
        assertThat(result, is(10));
    }

}