package ru.job4j.loop;

import com.sun.source.tree.BreakTree;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean result = number > 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        } return result;
    }
}