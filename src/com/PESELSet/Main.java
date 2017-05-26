package com.PESELSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {


        //1. zrobić zbiór który przyjmuje unikatowe wartości PESEL
        //2. wartości tego zbioru trzeba przemnożyć w taki sposób w jaki jest to opisane na necie
        //3. Rezultat trzeba scastować na inty

        Set<Integer> PeselList = new TreeSet<Integer>();

        PeselList = new HashSet<Integer>(Arrays.asList(8,8,1,1,2,7,1,1,3,1,7));
        //int foo = Integer.parseInt(PeselList);
        for (Integer element : PeselList){
            System.out.println(element);
        }
        if (PeselList.contains("8")) {


        }

    }



    }

