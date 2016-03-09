package com.codility.lessons.counting.elements;

import java.util.Arrays;

public class PermCheck {
    public int solution(int[] A) {
        Arrays.sort(A);

        int count = 1;

        for (int i = 0; i < A.length; i++) {
            if (A[i] != count) {
                return 0;
            }

            count++;
        }

        return 1;
    }
}
