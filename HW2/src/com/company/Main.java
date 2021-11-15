package com.company;

public class Main {

    public static void main(String[] args) {

        String str = "Afnan";
        System.out.println("Number of vowels: "+countVowels(str));

        int number1 = 10;
        int number2 = 20;
        System.out.println("The maximum number is: "+max(number1, number2));

        int num1 = 5;
        int num2 = 3;
        System.out.println("Before swap: number1 = "+num1+" and number2 = "+num2);
        swap(num1, num2);

        Country country = new Country("Saudi Arabie", "Arabic", 100.000000, "Riyadh", 23);
        System.out.println(country.toString());
    }

    public static int countVowels(String s){

        char[] chars = s.toCharArray();
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U')
                count++;
        }
        return count;
    }
    public static int max(int num1, int num2){
        if(num1 > num2)
            return num1;
        else
            return num2;
    }
    public static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swap: number1 = "+num1+" and number2 = "+num2);
    }
}

