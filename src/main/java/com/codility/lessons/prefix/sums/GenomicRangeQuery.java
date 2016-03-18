package com.codility.lessons.prefix.sums;

public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {

        int s = S.length();
        int p = P.length;

        int[] factors = new int[s];

        for (int i = 0; i < s; i++) {
            char e = S.charAt(i);

            if ('A' == e) {
                factors[i] = 1;
            } else if ('C' == e) {
                factors[i] = 2;
            } else if ('G' == e) {
                factors[i] = 3;
            } else {
                factors[i] = 4;
            }
        }

        int[] result = new int[p];
        int count = 0;

        while(count < p) {
            int start = P[count];
            int end = Q[count];
            int min = factors[start];

            for (int i = start + 1; i <= end; i++) {
                if (factors[i] < min) {
                    min = factors[i];
                }
            }

            result[count] = min;
            count++;
        }

        return result;
    }
}
