
package com.company;

import java.util.Arrays;


public class Main {

    public static void main(String[] args)
    {
        // Vowels in the word
        String name = "Saad";
        System.out.println("-------Vowels-------");
        System.out.println("The Vowels in ["+name+"] are: "+countVowels(name));

        // Max
        System.out.println("-------Max-------");
        System.out.println(max(20,50));

        // swap void method
        System.out.println("-------swap-------");
        swap(5,10);

        // Country class
        System.out.println("-------Country class-------");
        String [] saudiCities = {"Abha","Dammam","Jeddah"};
        Country obj1 = new Country("Saudi Arabia", "Arabic", "34.81 million", "Riyadh",saudiCities);
        System.out.println(obj1);

        String [] usCities = {"New York","Chicago","Los Angeles"};
        Country obj2 = new Country("United States", "English", "329.5 million", "Washington, D.C.",usCities);
        System.out.println(obj2);

        String [] ukCities = {"Glasgow","Bristol","Birmingham"};
        Country obj3 = new Country("United Kingdom", "English", "67.22 million", "London",ukCities);
        System.out.println(obj3);




    }

    private static void swap(int a, int b)
    {
        int current = a ;

        System.out.println("Before : a="+a+" b="+b);
        a = b;
        b = current;
        System.out.println("After : a="+a+" b="+b);
    }

    private static int countVowels(String name)
    {
        char [] vowels = {'A','a','E','e','I','i','O','o','U','u'};
        int count = 0;

        for (int i = 0; i < name.length(); i++)
        {
            for (int j = 0; j < vowels.length; j++)
            {
                if(name.charAt(i) == vowels[j])
                {
                    count ++;
                    break;
                }
            }
        }
        return count;
    }

    private static int max (int num1, int num2)
    {
        return num1 > num2 ? num1 : num2;
    }
}
