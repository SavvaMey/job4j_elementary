package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Assert;
public class PointTest {

    @Test
    public void distance() {
        int x1 = 1;
        int x2 = 5;
        int y1 = 2;
        int y2 = 8;
        double expected = 7.21;
        double out = Point.distance(x1 , y1 , x2 , y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}