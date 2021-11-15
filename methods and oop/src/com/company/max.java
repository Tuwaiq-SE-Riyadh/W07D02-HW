package com.company;

class Max {

    public static void main(String[] args) {

        System.out.println(maxNumber(2,5));
    }

    public static int maxNumber(int num1,int num2) {
        int max = 0;
        if (num1 > num2) {
            max = num1;

        }else if(num1 <num2){
            max=num2;
        }
        return max;


    }
}