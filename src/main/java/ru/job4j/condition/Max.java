package ru.job4j.condition;

public class Max {

    public int max(int a, int b, int c) {
    return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
}

    public int max(int a, int b, int c, int d) {
        int maxOfThree = max(a, b, c);
        return (maxOfThree > d) ? maxOfThree : d;
    }
}
