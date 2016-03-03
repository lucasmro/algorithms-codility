package com.codility.lessons.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OddOccurrencesInArrayTest {
    private OddOccurrencesInArray algorithm;

    @Before
    public void setUp() {
        algorithm = new OddOccurrencesInArray();
    }

    @Test
    public void testOne() {
        int[] A = { 9, 3, 9, 3, 9, 7, 9 };
        int expected = 7;

        int result = algorithm.solution(A);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testLastElement() {
        int[] A = { 1, 1, 2, 2, 3, 3, 4 };
        int expected = 4;

        int result = algorithm.solution(A);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testFirstElement() {
        int[] A = { 0, 1, 1, 2, 2, 3, 3 };
        int expected = 0;

        int result = algorithm.solution(A);

        Assert.assertEquals(expected, result);
    }
}
