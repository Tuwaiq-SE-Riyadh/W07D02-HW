package com.company;

public class Main {

    public static void main(String[] args) {
        String name= "Nasser";
        int vowels = countVowels(name);
        System.out.println("Name "+name+" has "+vowels+" vowels");
        System.out.println("----------------------------------------------------------");

        String maxNum = max(44,300);
        System.out.println(maxNum);
        System.out.println("----------------------------------------------------------");
        swapValues("Nasser","Abdullah");

        System.out.println("----------------------------------------------------------");

        String[] cityS = {"Jeddah","Abha","Makkah"};

        Country saudiArabia = new Country("Saudi Arabia","Arabic",34.81,"Riyadh",cityS);

        String[] citySp = {"Barcelona","Valencia","Seville"};
        Country spain = new Country("Spain","Spanish",47.35,"Madrid",citySp);

        String[] uk = {"Manchester","Liverpool","Cardiff"};
        Country unitedKingdom = new Country("United Kingdom","English",67.22,"London",uk);

        System.out.println(saudiArabia.toString());
        System.out.println("-------------");
        System.out.println(spain.toString());
        System.out.println("-------------");
        System.out.println(unitedKingdom.toString());



    }

    public static int countVowels(String name){
        int count =0;
        for (int i = 0; i < name.length(); i++) {
            if (name.toLowerCase().charAt(i)== 'e'|| name.toLowerCase().charAt(i)== 'a'||name.toLowerCase().charAt(i)== 'i'||name.toLowerCase().charAt(i)== 'o'||name.toLowerCase().charAt(i)== 'u'){
                count+=1;
            }
        }
        return count;
    }
    public static String max(int num1, int num2){
        return "Max number between "+num1+" and "+num2+" is "+ Math.max(num1,num2);
    }

    public static void swapValues(String firstName,String secondName){
        System.out.println("Before swapping FirstName ,SecondName: "+firstName+", "+secondName);
        String mid = firstName;
        firstName =secondName;
        secondName =mid;
        System.out.println("-------------");
        System.out.println("After swapping FirstName ,SecondName: "+firstName+", "+secondName);


    }
}
