package com.codility.lessons.counting.elements;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MissingIntegerTest {
    private MissingInteger algorithm;

    @Before
    public void setUp() {
        algorithm = new MissingInteger();
    }

    @Test
    public void testMissingFive() {
        int[] A = { 1, 3, 6, 4, 1, 2 };

        int expected = 5;

        int result = algorithm.solution(A);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testMissingOne() {
        int[] A = { 6, 5, 3, 4, 2 };

        int expected = 1;

        int result = algorithm.solution(A);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testNothingMissing() {
        int[] A = { 6, 5, 3, 4, 2, 1 };

        int expected = 7;

        int result = algorithm.solution(A);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testNegativeNumbers() {
        int[] A = { -2147483648, 2147483647 };

        int expected = 1;

        int result = algorithm.solution(A);

        Assert.assertEquals(expected, result);
    }



}
