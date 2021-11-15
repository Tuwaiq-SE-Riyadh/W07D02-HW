package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----------------Vowels in the word-----------------");
        System.out.print("Tameem : ");
        vowelsInTheWord("Tameem");
        System.out.println();

        System.out.println("-----------------------Max---------------------------");
        System.out.println("Max (2,4): "+Max(2,4));
        System.out.println();

        System.out.println("-----------------------Swap void method---------------------------");
        String a = "a";
        String b = "b";
        System.out.println("Before: \na value="+a+"\nb value="+b);
        swapVoidMethod(a,b);
        System.out.println();


        System.out.println("-----------------------Country class---------------------------");
        Country c1 = new Country("Country1","language1",1000000, "capital1","cities1, cities1, cities1");
        Country c2 = new Country("Country2","language2",2000000, "capital2","cities2, cities2, cities2");
        Country c3 = new Country("Country3","language3",3000000, "capital3","cities3, cities3, cities3");
        System.out.println(c1);
        System.out.println("========");
        System.out.println(c2);
        System.out.println("========");
        System.out.println(c3);
        System.out.println();
    }

public static void vowelsInTheWord(String name ){
        int count = 0;
        for(int i = 0 ; i < name.length() ; i++){

            if(name.charAt(i) == 'O' || name.charAt(i) == 'A' || name.charAt(i) == 'E' || name.charAt(i) == 'U' || name.charAt(i) == 'I') {
                count++;
            }
            if(name.charAt(i) == 'o' || name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'u' || name.charAt(i) == 'i') {
                count++;
            }
        }
    System.out.println("Vowels in the word:"+count);
}




public static int Max(int num1 , int num2){
if(num1 > num2){
    return num1;}

return num2;
}


public static void swapVoidMethod(String a , String b){
    String temp = a;
    a = b;
    b = temp;
    System.out.println("After: \na value="+a+"\nb value="+b);

}

}



class Country {
    public String name;
    public String language;
    public int population;
    public String capital;
    public String cities;

    public Country(String name, String language, int population, String capital, String cities){
        this.name = name;
        this.language = language;
        this.population = population;
        this.capital = capital;
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", population=" + population +
                ", capital='" + capital + '\'' +
                ", cities='" + cities + '\'' +
                '}';
    }
}

