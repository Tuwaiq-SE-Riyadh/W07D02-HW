package com.company;

public class Max {

    public static void main(String[] args) {
        System.out.println("Max number is: "+max(20,10));

    }
    public static int max (int num1,int num2){
        if(num1 > num2){
            return num1;
        }
        else {
            return num2;
        }
    }
}
