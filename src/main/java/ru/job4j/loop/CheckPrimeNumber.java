package ru.job4j.loop;

import com.sun.source.tree.BreakTree;

public class CheckPrimeNumber {

    public static boolean check(int number) {
       if (number == 1) {
           return false;
       }
        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                return false;
            }
            }
        return true;
    }
}

