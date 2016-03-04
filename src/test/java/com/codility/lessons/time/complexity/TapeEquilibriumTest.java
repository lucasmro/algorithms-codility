package com.codility.lessons.time.complexity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TapeEquilibriumTest {
    private TapeEquilibrium algorithm;

    @Before
    public void setUp() {
        algorithm = new TapeEquilibrium();
    }

    @Test
    public void testOne() {
        int[] A = {3, 1, 2, 4, 3};

        int expected = 1;

        int result = algorithm.solution(A);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testTwoElements() {
        int[] A = {-1000, 1000};

        int expected = 2000;

        int result = algorithm.solution(A);

        Assert.assertEquals(expected, result);
    }
}
