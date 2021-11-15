package com.company;

 class Vowels {

     public static void main(String[] args) {
         // write your code here
         String name="thuriaabdullah";
         System.out.println("the count vowels in my name");

         System.out.println(countVowel(name));
     }

     public static int countVowel(String s) {
         int count = 0;
         for (int i = 0; i < s.length(); i++) {
             String x = s.toUpperCase();
             if(x.charAt(i) == 'A' || x.charAt(i) == 'E' || x.charAt(i) == 'I' || x.charAt(i) == 'O' || x.charAt(i)=='U')
             count+=1;


         }

return count;
     }
 }
