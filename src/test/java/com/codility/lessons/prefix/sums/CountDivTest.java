package com.codility.lessons.prefix.sums;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CountDivTest {
    private CountDiv algorithm;

    @Before
    public void setUp() {
        algorithm = new CountDiv();
    }

    @Test
    public void testOne() {
        // 6, 7, 8, 9, 10, 11
        int A = 6;
        int B = 11;
        int K = 2;

        int expected = 3;

        int result = algorithm.solution(A, B, K);

        Assert.assertEquals(expected, result);
    }


    @Test
    public void testTwo() {
        // 6, 7, 8, 9, 10, 11
        int A = 6;
        int B = 11;
        int K = 4;

        int expected = 1;

        int result = algorithm.solution(A, B, K);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testThree() {
        // 7, 8, 9, 10, 11, 12, 13
        int A = 7;
        int B = 13;
        int K = 3;

        int expected = 2;

        int result = algorithm.solution(A, B, K);

        Assert.assertEquals(expected, result);
    }
}
