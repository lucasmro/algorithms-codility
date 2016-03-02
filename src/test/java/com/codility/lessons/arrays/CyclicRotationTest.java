package com.codility.lessons.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CyclicRotationTest {
    private CyclicRotation algorithm;

    @Before
    public void setUp() {
        algorithm = new CyclicRotation();
    }

    @Test
    public void testOneRotation() {
        int[] A = { 3, 8, 9, 7, 6 };
        int K = 1;

        int[] expected = { 6, 3, 8, 9, 7 };

        int[] result = algorithm.solution(A, K);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testThreeRotations() {
        int[] A = { 3, 8, 9, 7, 6 };
        int K = 3;

        int[] expected = { 9, 7, 6, 3, 8 };

        int[] result = algorithm.solution(A, K);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testEmpty() {
        int[] A = {};
        int K = 1;

        int[] expected = {};

        int[] result = algorithm.solution(A, K);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testTwoRotationsWithTwoElements() {
        int[] A = { -9, 0 };
        int K = 2;

        int[] expected = { -9, 0 };

        int[] result = algorithm.solution(A, K);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testFourRotationsWithOneElement() {
        int[] A = { 1 };
        int K = 4;

        int[] expected = { 1 };

        int[] result = algorithm.solution(A, K);

        Assert.assertArrayEquals(expected, result);
    }
}
