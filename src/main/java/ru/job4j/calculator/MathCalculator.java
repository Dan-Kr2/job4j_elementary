package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }

    public static double sumOfMinusAndDel(double first, double second) {
        return ru.job4j.math.MathFunction.minus(first, second) + ru.job4j.math.MathFunction.del(first, second);
    }

    public static double sumOfAllOps(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second) + ru.job4j.math.MathFunction.minus(first, second) + ru.job4j.math.MathFunction.del(first, second) + ru.job4j.math.MathFunction.multiply(first, second);
    }
}
