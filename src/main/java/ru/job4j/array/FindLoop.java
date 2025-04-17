package ru.job4j.array;

import com.sun.source.tree.BreakTree;

public class FindLoop {
    public static int indexOf(int[] data, int element) {
        int result = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == element) {
                result = index;
                break;
            }
        }
        return result;
    }

    public static int indexInRange(int[] data, int element, int start, int finish) {
        for (int result = start; result <= finish; result++) {
            if (data[result] == element) {
                return result;
            }
        } return -1;
    }
}