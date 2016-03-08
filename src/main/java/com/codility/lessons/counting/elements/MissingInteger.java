package com.codility.lessons.counting.elements;

import java.util.Arrays;

public class MissingInteger {
    public int solution(int[] A) {
        Arrays.sort(A);

        int count = 0;

        for (int i = 0; i < A.length; i++) {
            if (count < A[i] && count + 1 == A[i]) {
                count++;
            } else if (count + 1 < A[i]) {
                return count + 1;
            }
        }

        return count + 1;
    }
}
