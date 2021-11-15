package com.company;
import java.util.Scanner;

public class Main {

        public static void main(String[] args)
        {
            //Country class
            Country count1 = new Country("Saudi" ,"Arabia" ,778987600,"Riyadh","Riyadh, Jeddah and Makkah");
            Country count2 = new Country("Kuwait" ,"Arabia" ,67800,"Kuwait"," Kuwait and  Mubarak ");
            Country count3 = new Country("turkey" ,"turkey" ,4888960,"Ankara"," İzmir and  Istanbul ");


            System.out.println(count1.toString());
            System.out.println(count2.toString());
            System.out.println(count3.toString());


            //Vowels in the word
            System.out.print("Number of  Vowels in the name Ghadeer : " + countVowels("Ghadeer")+"\n");
//swap void method
int x = 15, y = 20;
            System.out.println("Before swapping x and y are: X="+ x + ", Y=" + y);
            swap(x, y);
            //Max
            System.out.println("Enter the Number 1: ");
            Scanner sc= new Scanner(System.in);
            int num1= sc.nextInt();
            System.out.println("Enter the Number 2: ");
            int num2= sc.nextInt();
            System.out.println("maximum between the two numbera is "+max(num1,num2));


        }


//Vowels in the word
    public static int countVowels(String name)
        {
            int numberVowels = 0;
            for (int i = 0; i < name.length(); i++)
            {
                if (name.charAt(i) == 'u' ||  name.charAt(i) == 'i' ||  name.charAt(i) == 'e'
                        || name.charAt(i) == 'o' || name.charAt(i) == 'a')
                {
                    numberVowels++;
                }
            }
            return numberVowels;
        }
//Max
    public static int max(int num1,int num2){
    return Math.max(num1,num2);
    }
    //swap void method
    public static void swap(int x, int y)
    {

       int z = x;
       x=y;
       y=z;

        System.out.println("After swapping  x and y are: X="+ x + ",Y=" + y);
    }


}


