package com.codility.lessons.counting.elements;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FrogRiverOneTest {
    private FrogRiverOne algorithm;

    @Before
    public void setUp() {
        algorithm = new FrogRiverOne();
    }

    @Test
    public void testOne() {
        int[] A = { 1, 3, 1, 4, 2, 3, 5, 4 };
        int X = 5;

        int expected = 6;

        int result = algorithm.solution(X, A);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testTwo() {
        int[] A = { 1, 1, 3, 2, 5, 6, 7, 4 };
        int X = 4;

        int expected = 7;

        int result = algorithm.solution(X, A);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testWhenIsNotPossibleToCrossToTheOtherSide() {
        int[] A = { 1, 2, 3, 4, 6, 2, 7 };
        int X = 5;

        int expected = -1;

        int result = algorithm.solution(X, A);

        Assert.assertEquals(expected, result);
    }
}
