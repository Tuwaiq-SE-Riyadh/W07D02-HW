package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    String word="" ;
        System.out.println("please write the word to count how many vowels in the word");
        word=input.next();
        System.out.println("vowels in the\t"+word+"\t "+vowels(word));
        int num1=0;
        int num2=0 ;
        System.out.println("please write two numbers to compare them which the max number ");
        System.out.println("Write the first number");
        num1=input.nextInt();
        System.out.println("Write the second number");
        num2=input.nextInt() ;
        System.out.println("the max number is \t"+max(num1,num2));
        System.out.println("Write two words to swap with them");
        String word1 ,word2 ;
        System.out.println("Write first word ");
        word1=input.next();
        System.out.println("Write second word ");
        word2=input.next();
        swap(word1,word2);
        Country countrySa = new Country("Saudi Arabia","Arabic","34.81 million","Riyadh",46);
        Country countryUae = new Country("United Arab Emirates","Arabic","9.89 million","Abu Dhabi",10);
        Country countryUk = new Country("United Kingdom","English","67.22 million","London ",40);
        System.out.println(countrySa.toString());
        System.out.println(countryUae.toString());
        System.out.println(countryUk.toString());
    }

   public static int vowels(String word){
        int count=0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='o'||word.charAt(i)=='u'||word.charAt(i)=='i') {
                count++;
            }
        }
    return count;
    }

   public static int max(int num1 , int num2){
        if (num1>num2){
            return num1 ;
        }else{
            return num2;
        }
  }

  public static void swap(String word1 , String word2){
        String temp;
        temp=word1;
        word1= word2;
        word2=temp;
        System.out.println("after the swap words the first word is \t"+word1+"\t the second word is\t"+word2);

    }

}
