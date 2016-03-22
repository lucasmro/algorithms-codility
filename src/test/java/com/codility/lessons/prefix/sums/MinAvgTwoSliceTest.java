package com.codility.lessons.prefix.sums;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinAvgTwoSliceTest {
    private MinAvgTwoSlice algorithm;

    @Before
    public void setUp() {
        algorithm = new MinAvgTwoSlice();
    }

    @Test
    public void testOne() {
        int[] A = { 4, 2, 2, 5, 1, 5, 8 };

        int expected = 1;

        int result = algorithm.solution(A);

        Assert.assertEquals(expected, result);
    }
}
