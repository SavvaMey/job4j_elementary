package ru.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.Point;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(0, 0,10);
        Point b = new Point(4, 0,5);
        double rsl = a.distance3d(b);
        assertThat(rsl, closeTo(6.4031, 0.001));
//        double out = Point.distance(x1 , y1 , x2 , y2);
//        Assert.assertEquals(expected, out, 0.01);
    }
}