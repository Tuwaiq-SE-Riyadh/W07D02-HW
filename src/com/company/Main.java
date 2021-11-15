package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //step1
        Scanner name1=new Scanner(System.in);
        System.out.println("Enter name to count the vowels: ");
        String name=name1.nextLine();
        System.out.println("Number of the vowels in "+name+"is "+Vowels(name));
        //step2
        Scanner number1=new Scanner(System.in);
        System.out.println("Enter two numbers to return the maximum between them: \n Enter the first number");
        int num1=number1.nextInt();
        System.out.println("Enter the second number");
        Scanner number2=new Scanner(System.in);
        int num2=number2.nextInt();
        System.out.println("The maximum number between "+num1+" and "+num2+" is "+Max(num1,num2));
    }
    public static int Vowels(String name){
        int count=0;
        for(int i=0; i<name.length(); i++) {
        if(name.charAt(i)=='a'|| name.charAt(i)=='e' || name.charAt(i)=='i'|| name.charAt(i)=='o'|| name.charAt(i)=='u') {
        count++;
        }
        }
        return count;
    }
    public static int Max(int num1,int num2){
        int max=0;
        max=Math.max(num1,num2);
        return max;
    }
}

