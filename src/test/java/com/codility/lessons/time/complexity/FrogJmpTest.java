package com.codility.lessons.time.complexity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FrogJmpTest {
    private FrogJmp algorithm;

    @Before
    public void setUp() {
        algorithm = new FrogJmp();
    }

    @Test
    public void testOne() {
        int X = 10;
        int Y = 85;
        int D = 30;

        int expected = 3;

        int result = algorithm.solution(X, Y, D);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testTwo() {
        int X = 0;
        int Y = 60;
        int D = 30;

        int expected = 2;

        int result = algorithm.solution(X, Y, D);

        Assert.assertEquals(expected, result);
    }
}
