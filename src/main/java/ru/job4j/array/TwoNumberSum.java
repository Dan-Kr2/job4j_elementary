package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int l = 0;
        int r = array.length - 1;
        while (l < r) {
            int sum = array[l] + array[r];
            if (sum == target) {
                return new int[]{l, r};
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return new int[0];
    }
}