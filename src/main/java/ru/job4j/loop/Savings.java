package ru.job4j.loop;

public class Savings {

    public static int years(double goal, double annualDeposit, double percent) {
        int years = 0;
        double total = 0;
        do {
            years++;
            total = total + annualDeposit + (total * (percent / 100));
        } while (total < goal);
        return years;
    }
}