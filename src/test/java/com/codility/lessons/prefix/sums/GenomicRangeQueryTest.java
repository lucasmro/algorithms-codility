package com.codility.lessons.prefix.sums;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GenomicRangeQueryTest {
    private GenomicRangeQuery algorithm;

    @Before
    public void setUp() {
        algorithm = new GenomicRangeQuery();
    }

    @Test
    public void testOne() {
        String S = "CAGCCTA";
        int[] P = { 2, 5, 0 };
        int[] Q ={ 4, 5, 6 };

        int[] expected = { 2, 4, 1 };

        int[] result = algorithm.solution(S, P, Q);

        Assert.assertArrayEquals(expected, result);
    }
}
