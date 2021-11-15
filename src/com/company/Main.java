package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //count vowels
        Scanner name1=new Scanner(System.in);
        System.out.println("Enter name to count the vowels: ");
        String name=name1.nextLine();
        System.out.println("Number of the vowels in "+name+"is "+Vowels(name));
        //max
        Scanner number1=new Scanner(System.in);
        System.out.println("Enter two numbers to return the maximum between them: \n Enter the first number");
        int num1=number1.nextInt();
        System.out.println("Enter the second number");
        Scanner number2=new Scanner(System.in);
        int num2=number2.nextInt();
        System.out.println("The maximum number between "+num1+" and "+num2+" is "+Max(num1,num2));
        //swap
        System.out.println("Enter two numbers to swap their values \n Enter first number: ");
        Scanner val1=new Scanner(System.in);
        int value1=val1.nextInt();
        System.out.println("Enter second number: ");
        Scanner val2=new Scanner(System.in);
        int value2=val2.nextInt();
        System.out.println("numbers before swapping number1= "+value1+" and number2= "+value2);
        Swap(value1,value2);
        //OOP
        Country country=new Country("Saudi Arabia","Arabic","3B","Riyadh","jeddah,Makkah");
        System.out.println(country.toString());
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
    public static void Swap(int value1,int value2){
        int value3=value1;
        value1=value2;
        value2=value1;
        System.out.println("numbers after swapping number1= "+value1+" and number2= "+value2);

    }
}

