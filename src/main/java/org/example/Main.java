package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("I did, did I?"));


    }

    public static boolean checkForPalindrome(String input){
        String tekKelime=input.replaceAll("[.,!\\\\-_?\\\\s]","").toLowerCase();
        char[] harfler=tekKelime.toCharArray();
        //list<Character> charList
        char[] rHarfler = new char[harfler.length];
        for(int i=0; i<harfler.length;i++){
            rHarfler[(harfler.length-1)-i]=harfler[i];
        }
        if(Arrays.equals(rHarfler, harfler)){
            System.out.println("Polindrom");
            return true;
        }
         return false;



    }

}