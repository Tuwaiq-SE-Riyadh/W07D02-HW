
package com.company;

import java.util.Arrays;


public class Main {

    public static void main(String[] args)
    {
        // Vowels in the word
        String name = "Saad";
        System.out.println("The Vowels in ["+name+"] are: "+countVowels(name));

        // Max

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
}
