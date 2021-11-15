package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Q1");
        String name="amal";
        countVowels(name );


        System.out.println("Q2");
        int max=max(4,1);
        System.out.println("the max number is "+ max);


        System.out.println("Q3");
        int a=10;
        int b=5;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        swap(a,b);




//        Q4
        Country country1=new Country("Saudi","Arabic",100000,"Riaydh","Jeddah");
        Country country2=new Country("Qatr","Arabic",100000,"aldoha","aldoha");
        Country country3=new Country("Kuwait","Arabic",100000,"KUWAIT","Kuwait");

        System.out.println("Q4");
        System.out.println(country1.toString());
        System.out.println(country2.toString());
        System.out.println(country3.toString());
    }


    //   Q1
    public static void countVowels(String name ){
        int counter=0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='a' ||name.charAt(i)=='e' ||name.charAt(i)=='i' ||name.charAt(i)=='o' ||name.charAt(i)=='u'||name.charAt(i)=='y' ){
                counter++;
            }
        }
        System.out.println("counter ="+counter);
    }


    //    Q2
    public static int max(int num1,int num2){
        int max ;
        if(num1>num2){
            max=num1;
        }else{
            max=num2;
        }
        return max;
    }


    //    Q3
    public static void swap(int a, int b ){
        int temp;

        temp=a;
        a=b;
        b=temp;
        System.out.println("in swap");
        System.out.println("a ="+a);
        System.out.println("b ="+b);
    }



}
