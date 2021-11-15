package com.company;

class Swap {

    public static void main(String[] args) {
        int number1=5;
        int number2=7;
        System.out.println("Before swapping");
        System.out.println("the number 1="+number1 );
        System.out.println("the number 2="+number2 );

      swap(number1,number2);




    }
    public static void swap (int num1,int num2){

        //num1
        int temp=num1;// temp=1
        num1=num2;//num1=2
        num2=temp;

        System.out.println("After swapping");
        System.out.println("the number1="+num1 );
        System.out.println("the number2="+num2);



    }

}
