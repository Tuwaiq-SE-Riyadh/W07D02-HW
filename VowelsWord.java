package com.company;

import java.util.Arrays;

public class VowelsWord {

    public static void main(String[] args) {
        // write your code here


        System.out.println("counter = "+counter("Ali"));
    }
    public static int counter(String name){
        String name1= name.toLowerCase();
        int counter = 0;

        for(int i=0;i<name.length();i++){
            if(name1.charAt(i)=='a' || name1.charAt(i)=='e'||name1.charAt(i)=='i' || name1.charAt(i)=='o' ||name1.charAt(i)=='u' ){
                counter ++ ;
            }
        }
        return counter;
    }
}
