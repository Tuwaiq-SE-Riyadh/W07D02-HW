package com.company;

public class Main {

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 66;
        String[] arr1 = new String[2];
        arr1[0] = "a";
        arr1[1] = "b";
        test obj = new test();
        System.out.println(test.vowle("FAHAD"));
        System.out.println(test.max(5, 6));
        System.out.println("Before swap:" + number1 + " " + number2);
        obj.swap(number1, number2);

        Country obj1 = new Country("Saudi Arabia", "Arabic", 30_000_000, "Riyadh", arr1);
        obj1.tostring();
        Country obj2 = new Country("United of Kingdoms", "English", 30_000_000, "London", arr1);
        obj2.tostring();
        Country obj3 = new Country("Saudi Arabia", "Arabic", 30_000_000, "Riyadh", arr1);
        obj1.tostring();

    }


}
