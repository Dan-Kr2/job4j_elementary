package ru.job4j.loop;

public class CheckPrimeNumber {

   public static void main(String[] args) {
        boolean a = check(35);
        System.out.println(a);
    }

    public static boolean check(int number) {
        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                break;

            } else {
                return true;
            }
        }
        return false;
    }
}

