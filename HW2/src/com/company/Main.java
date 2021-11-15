package com.company;

import java.util.Locale;

public class Main {

    public static int vowels(String word){

        // A E I O U
        int count = 0;
        // all cahr lower case
        String lowerCaseWord = word.toLowerCase();

        for (int i = 0; i < lowerCaseWord.length(); i++) {

            if(
                            (lowerCaseWord.charAt(i) == 'a') ||
                            (lowerCaseWord.charAt(i) == 'e') ||
                            (lowerCaseWord.charAt(i) == 'i') ||
                            (lowerCaseWord.charAt(i) == 'o') ||
                            (lowerCaseWord.charAt(i) == 'u')
            ){

                count++;
            }

        }

        return count;

    }


    public static int max(int num1, int num2){

        int maximum = num2;

            if(num1 > num2)
                maximum = num1;

        return maximum;
    }

    public static void swap(int num1, int num2){

        int sw;
        System.out.println("num1 => "+ num1);
        System.out.println("num2 => "+ num2);

        sw = num1;
        num1 = num2;
        num2 = sw;
        
        System.out.println("num1 => "+ num1);
        System.out.println("num2 => "+ num2);
    }
    public static void main(String[] args) {

        System.out.println( Main.vowels("Abdulla"));
        System.out.println( Main.max(100,20));
        Main.swap(300,500);
    }
}
