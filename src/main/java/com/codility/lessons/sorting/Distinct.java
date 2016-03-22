package com.codility.lessons.sorting;

import java.util.Arrays;

public class Distinct {
    public int solution(int[] A) {
        int n = A.length;

        if (n == 0) {
            return 0;
        }

        Arrays.sort(A);

        int countDistinct = 1;

        for (int i = 1; i < n; i++) {
            if (A[i] != A[i-1]) {
                countDistinct++;
            }
        }

        return countDistinct;
    }
}
