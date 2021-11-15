package com.company;

public class Main {

    public static void main(String[] args) {
        String result = "Stack  me out";

      int counter=  counterVoul(result);
      // print Vowels in the word
      System.out.println(counter);
       int max=  maxNumber1(3,4);
       // max number
        System.out.println(max);
        int num1=10;
        int num2=20;
        System.out.println( " the num1"+ " "+num1+ " " +" the num2"+" "+num2);
         swap(num1,num2);
//         System.out.println( " the num1"+ " "+num1+ " " +" the num2"+" "+num2);
    }

    //Vowels in the word
    public static int counterVoul( String result){

        int count1=0;
        for ( int x=0; x<result.length(); x++) {
            if( result.charAt(x) ==('a') || result.charAt(x)=='e'||result.charAt(x)=='i'||result.charAt(x)=='o'||result.charAt(x)=='u' ){
            count1 ++;
        }
    }
        return count1;
    }

//max
public static int maxNumber1( int num1, int num2){
int result=0;
    if(num1>num2){
        result+=num1;
    }else {
        result+=num2;
    }
    return result;
}
//swap
public static void swap( int num1, int num2){
    int resultswap =num1;
    num1=num2;
    num2=resultswap;

    System.out.println( " the num1"+ " "+num1+ " " +" the num2"+" "+num2);

}

}
