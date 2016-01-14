package com.codility.lessons.interations;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryGapTest {

    private BinaryGap algorithm;

    @Before
    public void setUp() {
        algorithm = new BinaryGap();
    }

    @Test
    public void testWhenInputIs1041TheGapShouldBe5() {
        int expected = 5;

        int result = algorithm.solution(1041); // 10000010001

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testWhenInputIs10TheGapShouldBe1() {
        int expected = 1;

        int result = algorithm.solution(10); // 1010

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testWhenInputIs20TheGapShouldBe1() {
        int expected = 1;

        int result = algorithm.solution(20); // 10100

        Assert.assertEquals(expected, result);
    }
}
