package com.company;

import java.util.Locale;

public class test {
    public static int vowle(String word) {
        int counter = 0;
        char c;
        for (int i = 0; i < word.length(); i++) {
            c = word.toLowerCase().charAt(i);

            if (c == 'a' || c == 'e' || c == 'l' || c == 'i' || c == 'u') {
                counter++;
            }
        }
        return counter;
    }

    public static int max(int number1, int number2) {
        if (number1 > number2)
            return number1;
        else return number2;
    }

    public  void swap(int number1, int number2) {
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("After swap:" + number1 + " " + number2);    }
}
