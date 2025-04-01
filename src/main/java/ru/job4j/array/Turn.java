package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
            for (int i = 0; i < array.length / 2; i++) {
                int horizon = array.length - 1 - i;
                int bucket = array[i];
                array[i] = array[horizon];
                array[horizon] = bucket;
            }
        return array;
    }
}