package com.codility.lessons.counting.elements;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        boolean[] tmp = new boolean[X + 1];
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            int e = A[i];

            if (e <= X && tmp[e] == false) {
                tmp[e] = true;
                count++;
            }

            if (count == X) {
                return i;
            }
        }

        return -1;
    }
}
