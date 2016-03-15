package com.codility.lessons.prefix.sums;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PassingCarsTest {
    private PassingCars algorithm;

    @Before
    public void setUp() {
        algorithm = new PassingCars();
    }

    @Test
    public void testOne() {
        int[] A = { 0, 1, 0, 1, 1 };

        // (0, 1), (0, 3), (0, 4), (2, 3), (2, 4).

        int expected = 5;

        int result = algorithm.solution(A);

        Assert.assertEquals(expected, result);
    }
}
