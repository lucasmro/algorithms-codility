package com.codility.lessons.arrays;

import java.util.Arrays;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        Arrays.sort(A);

        int n = A.length;
        int previous = A[0];

        for (int i = 1; i < n; i++) {
            if (i % 2 != 0 && A[i] != previous) {
                return previous;
            }

            previous = A[i];
        }

        return A[n - 1];
    }
}
