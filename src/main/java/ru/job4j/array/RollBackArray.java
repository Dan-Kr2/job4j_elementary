package ru.job4j.array;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        System.out.println("Элементы массива в обратном порядке: ");
        for (int i = 0; i < array.length; i++) {
            result[i] = array[array.length - i - 1];
        }
        return result;
    }
}
