package com.codility.lessons.sorting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DistinctTest {
    private Distinct algorithm;

    @Before
    public void setUp() {
        algorithm = new Distinct();
    }

    @Test
    public void testOne() {
        int[] A = { 2, 1, 1, 2, 3, 1 };

        int expected = 3;

        int result = algorithm.solution(A);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testEmpty() {
        int[] A = { };

        int expected = 0;

        int result = algorithm.solution(A);

        Assert.assertEquals(expected, result);
    }
}
