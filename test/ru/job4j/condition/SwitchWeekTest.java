package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void OneShouldMonday() {
        assertThat( SwitchWeek.nameOfDay(1),is("Понедельник"));
    }

    @Test
    public void NineShouldMonday() {
        assertThat( SwitchWeek.nameOfDay(9),is("Ошибка"));
    }
}