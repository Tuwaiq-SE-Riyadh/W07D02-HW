package JavaHW;

public class Main {

    public static void main(String[] args) {
        String name="Sarah";
        System.out.println("The name is: "+name+" it is contain a "+vowels(name)+" vowels");
        String name2="Saoud";
        System.out.println("The name is: "+name2+" it is contain a "+vowels(name2)+" vowels");

        int num1=100;
        int num2=500;
        System.out.println("The max number is: "+max(num1,num2));

        String course1="JAVA";
        String course2="Python";
        System.out.println("Before swapping course1: "+course1+" Course2: "+course2);
        swap(course1,course2);

        String []cities={"Makkah","Jeddah","Dammanm"};
        Country country1=new Country("Saudi Arabia","Arabic","10 milion","Riyadh",cities);
        System.out.println( country1.toString());

        String []cities2={"Makkah","Jeddah","Dammanm"};
        Country country2=new Country("Saudi Arabia","Arabic","10 milion","Riyadh",cities);
        System.out.println( country2.toString());

        String []cities3={"Makkah","Jeddah","Dammanm"};
        Country country3=new Country("Saudi Arabia","Arabic","10 milion","Riyadh",cities);
        System.out.println( country3.toString());
    }

//Vowels in the word
    public static int vowels (String name){
        int count=0;
     for(int i=0;i<name.length();i++){
         if(name.charAt(i)=='o'||name.charAt(i)=='e'||name.charAt(i)=='a'||name.charAt(i)=='i'||name.charAt(i)=='u'){
             count++;
         }
     }
        return count;
    }
    //Max
    public static int max(int num1,int num2){
        if(num1>num2)
        return num1;
        else
            return num2;
    }
    //swap void method
    public static void swap(String course1,String course2){
        String swap=course1;
        course1=course2;
        course2=swap;
        System.out.println("After swapping course1: "+course1+" Course2: "+course2);
    }

}
