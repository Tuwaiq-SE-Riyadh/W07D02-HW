package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter name");
        String name = scan.next();
        System.out.println("number of vowels in your name is: "+vowels(name));
        System.out.println("Enter two numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("the maximum number is: "+max(a,b));
        System.out.println("Enter first name");
        String fname = scan.next();
        System.out.println("Enter second name");
        String sname = scan.next();
        System.out.println("you entered first: "+fname+" and second: "+sname);
        swap(fname,sname);
        Country country1 = new Country("Saudi Arabia","Arabic","34.81 million","Riyadh",46);
        Country country2 = new Country("japan","japanese","125.8 million","tokyo",20);
        Country country3 = new Country("india","hindi","1.38 billion","new delhi",4000);
        System.out.println(country1.toString());
        System.out.println(country2.toString());
        System.out.println(country3.toString());



    }
    public static int vowels(String str){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='e')
                count++;
        }
        return count;
    }
    public static int max(int a,int b){
        if(b>a)
            return b;
        else
            return a;
    }
    public static void swap(String first,String second){
        String swaper = first;
        first= second;
        second=swaper;
        System.out.println("The first now is: "+first+" and the second is: "+second);
    }
}
