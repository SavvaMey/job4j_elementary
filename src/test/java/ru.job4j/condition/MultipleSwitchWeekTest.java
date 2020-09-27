package ru.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.MultipleSwitchWeek;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultipleSwitchWeekTest {

    @Test
    public void MondaynumberOfDayOne() {
        assertThat(1,is(MultipleSwitchWeek.numberOfDay("Monday")));
    }

    @Test
    public void MondayRusnumberOfDayOne() {
        assertThat(1,is(MultipleSwitchWeek.numberOfDay("Понедельник")));
    }

    @Test
    public void StringRusnumberOfDayShouldMinusOne() {
        assertThat(-1,is(MultipleSwitchWeek.numberOfDay("ик")));
    }
}