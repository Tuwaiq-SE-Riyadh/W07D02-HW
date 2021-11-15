package com.company;

public class SwapVoidMethod {

    public static void main(String[] args) {

        swap("fitst","second");

    }
    public static void swap(String val1,String val2){
        System.out.println("before Swaping " + val1 + " "+ val2);
        String a = val1;
        String b = val2;
        val1=b;
        val2=a;
        System.out.println("After Swaping " + val1 + " "+ val2);
    }
}
