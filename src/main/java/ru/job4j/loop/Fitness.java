package ru.job4j.loop;

import ru.job4j.calculator.Fit;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            //System.out.println("Иван: " + ivan + " " + "Николай: " + nik);
            ivan = ivan * 3;
            nik = nik * 2;
            month++;
        }
        return month;
    }
}
