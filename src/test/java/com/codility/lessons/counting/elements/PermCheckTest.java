package com.codility.lessons.counting.elements;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PermCheckTest {
    private PermCheck algorithm;

    @Before
    public void setUp() {
        algorithm = new PermCheck();
    }

    @Test
    public void testIsPermutation() {
        int[] A = { 4, 1, 3, 2 };

        int expected = 1;

        int result = algorithm.solution(A);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testIsPermutationOnlyOneElement() {
        int[] A = { 1 };

        int expected = 1;

        int result = algorithm.solution(A);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testIsNotPermutationBecauseElementIsMissing() {
        int[] A = { 4, 1, 3 };

        int expected = 0;

        int result = algorithm.solution(A);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testIsNotPermutationBecauseElementIsDuplicated() {
        int[] A = { 2, 2, 1, 3 };

        int expected = 0;

        int result = algorithm.solution(A);

        Assert.assertEquals(expected, result);
    }
}
