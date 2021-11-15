package javaMethodsAndOopHW;

public class JavaMethods {

	public static void main(String[] args) {
//		test vowelsInTheWord() method
		String name = "Faisal";
		System.out.println("vowels in " + name + " = " + vowelsInTheWord(name));
		
//		test max() method
		int number1 = 15;
		int number2 = 3;
		System.out.println("max number is = " + max(number1, number2));
		
//		test swap() method
		swap(number1, number2);
		

	}
	
//	this method return the count of vowels in that name
	public static int vowelsInTheWord(String word){
		return word.length();
	}

//	This method takes two parameters num1 and num2 and returns the maximum between the two
	public static int max(int num1, int num2){
		if(num1 >= num2){
			return num1;
		}
		else {
			return num2;
		}
	}
	
//	this method will take two parameters and swapping thier values
	public static void swap(int var1, int var2){
		System.out.println("Before swapping: " + var1 + " , " + var2);
		int var3 = var1;
		var1 = var2;
		var2 = var3;
		System.out.println("After swapping: " + var1 + " , " + var2);
	}

}
