package com.company;
import java.util.Scanner;

public class Main {


        public static void main(String[] args) {

            Country n1 = new Country(" ali", " arabic ",100," riyadh ", 23);

          Country n2 = new Country (" amal", " arabic ",200," dubai ", 20);

            Country n3 = new Country (" sara", " english ",500," doha ", 10);


            System.out.println(n1);
            System.out.println(n1.toString());

            System.out.println(n2);
            System.out.println(n2.toString());

            System.out.println(n3);
            System.out.println(n3.toString());

        }
    }

