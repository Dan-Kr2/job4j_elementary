package ru.job4j.array;

public class SimpleStringEncoder {

    public static String encode(String input) {
        String result = "";
        int border = input.length();
        char model = input.charAt(0);
        int counter = 1;
        char symbol;
        for (int i = 1; i < border; i++) {
            symbol = input.charAt(i);
            if (symbol == model) {
                counter++;

            } else {
                result += model;
                if (counter > 1) {
                    result += counter;
                }

                model = symbol;
                counter = 1;
            }
        }
            result += model;
            if (counter > 1) {
                result += counter;
            }
            return result;
        }
    }

