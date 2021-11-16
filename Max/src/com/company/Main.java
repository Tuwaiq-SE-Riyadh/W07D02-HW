package com.company;
import java.util.Scanner;
public class Main {



    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter number 1");

        int i=input.nextInt();
        System.out.println("Enter number 2");

        int j=input.nextInt();
        int k = max(i, j);
        System.out.println("The maximum between " + i +
                " and " + j + " is " + k);
    }
    /** Return the max between two numbers */
    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;
        return result;

    }



}