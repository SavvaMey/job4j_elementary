package ru.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.condition.Max.max;

public class MaxTest {

    @Test
    public void whenMax5101020Then20() {
       Max max = new Max();
       int rsl = max(5, 10, 10, 20);
        assertThat(rsl, is(20));
    }

    @Test
    public void whenMax51010Then10() {
        Max max = new Max();
        int rsl = max(5, 10, 10);
        assertThat(rsl, is(10));
    }
}