package ru.job4j.fit;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void ThenManHeightt187When100() {
        short height = 187;
        double expected = 100.05;
        double out = Fit.manWeight(height);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void ThenWomanHeight190When92() {
        short height = 190;
        double expected = 92;
        double out = Fit.womanWeight(height);
        Assert.assertEquals(expected, out, 0.01);
    }
}