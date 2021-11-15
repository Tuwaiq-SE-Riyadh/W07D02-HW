package com.company;

public class Main {

    public static void main(String[] args) {
	Country country1 = new Country("ksa","Arabic",300000,"Riyadh","Jeddah,Makkah,Taif");
    country1.toSrting();
        Country country2 = new Country("US","English",1000000,"Washington","NY , LA");
        country2.toSrting();
        Country country3 = new Country("UK","English",200000,"London","Manchester , Liverpool");
        country3.toSrting();
    }
}
