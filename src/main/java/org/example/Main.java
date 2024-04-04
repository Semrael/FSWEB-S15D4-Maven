package org.example;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));

        HashSet<Integer> datas=new HashSet<>();
        datas.add(25);
        datas.add(55);
        datas.add(17);
        datas.add(0);
        System.out.println(convertDecimalToBinary(datas));


    }

    public static boolean checkForPalindrome(String input){
       String kucukHarf=input.replace("I","i").toLowerCase();
       String tekKelime=kucukHarf.replaceAll("[.,!\\-_?\\s]","");

        char[] harfler=tekKelime.toCharArray();
        char[] rHarfler = new char[harfler.length];
        for(int i=0; i<harfler.length;i++){
            rHarfler[(harfler.length-1)-i]=harfler[i];
        }
        return Arrays.equals(rHarfler,harfler);

    }

    public static Set<String> convertDecimalToBinary(HashSet<Integer> datas){
        Set<String> binaries=new HashSet<>();
        for(int data:datas){
            StringBuilder binary=new StringBuilder();

            if(data==0){
                binary.append("0");
            }
            else{
                int num =data;
                while(num>0){
                    int kalan=num%2;
                    binary.append(kalan);
                    num=num/2;
                }
            }
            binary.reverse();
            binaries.add(binary.toString());

        }
        return binaries;
    }


}