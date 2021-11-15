package HW;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here

    // Vowels in the word
        // pass a name to the function that return the count of vowels in that name
        // print the result
        String name = "Shrooq Saleh Alamri";
        System.out.println("The name is: "+name);
        System.out.println(countVowels(name));
    // Max
        // Define method called max(). This method takes two parameters num1 and num2 and returns the maximum between the two
        System.out.println(maxNum(4,3));
    // swap void method
        // create void method that will be passed two parameters and swapping thier values
        // print the result after and before swapping
        swap(1,2);
    // Country class
        // Create class named Country should contain:
            // At least five attributes (name, language, population, capital and cities)
            // A constructor
            // A toString method to display the values of all the attributes of each class
        // In the main method create 3 instances of the class and run the toString method.
        Country country1 = new Country("Shrooq","Arabic","a","Saudi Arabia","Riyadh");
        System.out.println(country1.toString());
        Country country2 = new Country("Sarah","English","a","Saudi Arabia","Riyadh");
        System.out.println(country2.toString());
        Country country3 = new Country("Manar","Arabic","a","Saudi Arabia","Riyadh");
        System.out.println(country3.toString());
    }
    public static int countVowels(String name){
        int count = 0;
        name = name.toLowerCase();
        System.out.println("Vowels found:");
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){
                count++;
                System.out.print(name.charAt(i)+" ");
            }
        }
        System.out.println();
        return count;
    }
    public static int maxNum(int num1, int num2){
        if(num1>num2) {
            System.out.println("The maximum number is: ");
            return num1;
        }
        else if(num1==num2)
            System.out.println("Two numbers are Equals");
        else
            System.out.println("The maximum number is: ");
        return num2;
    }
    public static void swap(int num1, int num2) {
        int temp= num1;
        System.out.println("first before swap: " +num1);
        System.out.println("second before swap: " +num2);
        num1 = num2;
        num2 = temp;
        System.out.println("first after swap: " +num1);
        System.out.println("second after swap: " +num2);
    }
    }

