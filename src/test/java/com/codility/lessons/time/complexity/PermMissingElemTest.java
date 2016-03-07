package com.codility.lessons.time.complexity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PermMissingElemTest {
    private PermMissingElem algorithm;

    @Before
    public void setUp() {
        algorithm = new PermMissingElem();
    }

    @Test
    public void testOne() {
        int[] A = { 2, 3, 1, 5 };

        int expected = 4;

        int result = algorithm.solution(A);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testEmptyElement() {
        int[] A = { };

        int expected = 1;

        int result = algorithm.solution(A);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSingleElement() {
        int[] A = { 1 };

        int expected = 2;

        int result = algorithm.solution(A);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testMissingFirstElement() {
        int[] A = { 5, 4, 3, 2 };

        int expected = 1;

        int result = algorithm.solution(A);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testMissingLastElement() {
        int[] A = { 4, 3, 2, 1 };

        int expected = 5;

        int result = algorithm.solution(A);

        Assert.assertEquals(expected, result);
    }
}
