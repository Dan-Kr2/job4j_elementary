package ru.job4j.loop;

import com.sun.source.tree.BreakTree;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean result = false;
       if (number == 1) {
           return result;
       }
        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                return result;
            }
            }
        result = true;
        return result;
    }
}