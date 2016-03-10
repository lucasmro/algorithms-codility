package com.codility.lessons.counting.elements;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxCountersTest {
    private MaxCounters algorithm;

    @Before
    public void setUp() {
        algorithm = new MaxCounters();
    }

    @Test
    public void testOne() {
        int N = 5;
        int[] A = { 3, 4, 4, 6, 1, 4, 4 };

        int[] expected = { 3, 2, 2, 4, 2 };

        int[] result = algorithm.solution(N, A);

        Assert.assertArrayEquals(expected, result);
    }
}
