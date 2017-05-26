package com.PESELSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {


        // zrobić zbiór który przyjmuje unikatowe wartości PESEL
        // Creating a Set with PESEL numerals

        Set<String> PeselList = new TreeSet<String>();

        PeselList = new HashSet<String>(Arrays.asList("8","8","1","1","2","7","1","1","3","1","7"));
        //int foo = Integer.parseInt(PeselList);
        for (String element : PeselList){
            System.out.println(element);
        }
        if (PeselList.contains("8")) {
            

        }

    }



    }

