package ru.job4j.loop;

public class NumberPyramid {

    public static void draw(int n) {
        for (int i = 1; i <= n; i++) {
            for (int pr = n; pr > i; pr--) {
                System.out.print(" ");
            }
            for (int pos = 1; pos <= i; pos++) {
                System.out.print(pos);
            }
            for (int neg = i - 1; neg != 0; neg--) {
                System.out.print(neg);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Number pyramid of height 3:");
        draw(3);
        System.out.println("Number pyramid of height 5:");
        draw(5);
    }
}