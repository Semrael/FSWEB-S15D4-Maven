package org.example;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));


        //WorkintechList-------------------
        System.out.println("------------------------------");
        WorkintechList wList=new WorkintechList();
        wList.add(7891);
        wList.add(90);
        wList.add(1213);
        wList.add(8234);
        wList.add(-123);

        System.out.println(wList);
        wList.sort();
        System.out.println(wList);
        System.out.println(wList.remove(0));
        System.out.println(wList);


       //----------toBinary
        System.out.println("******************************");
        System.out.println(convertDecimalToBinary(123));


        // HashSet<Integer> datas = new HashSet<>();
//        datas.add(10);
//        datas.add(5);
//        datas.add(20);
//
//        Set<String> binaries = convertDecimalToBinary(datas);
//        System.out.println(binaries);




    }

//    public static boolean checkForPalindrome(String input){
//       String kucukHarf=input.replace("I","i").toLowerCase();
//       String tekKelime=kucukHarf.replaceAll("[.,!\\-_?\\s]","");
//
//        char[] harfler=tekKelime.toCharArray();
//        char[] rHarfler = new char[harfler.length];
//        for(int i=0; i<harfler.length;i++){
//            rHarfler[(harfler.length-1)-i]=harfler[i];
//        }
//        return Arrays.equals(rHarfler,harfler);
//        // return rHarfler.equals(harfler);
//
//    }
    //Emre hocanın çözümü
    public static boolean checkForPalindrome(String input){
        String  cleanedInput=input.replace("I","i").replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        LinkedList<Character> charList=new LinkedList<>();
        for(char c:cleanedInput.toCharArray()){
            charList.add(c);
        }
        while(charList.size()>1){
            if(!charList.pollFirst().equals(charList.pollLast())){
                return false;
            }
        }
        return true;
    }











//    public static Set<String> convertDecimalToBinary(HashSet<Integer> datas){
//        Set<String> binaries=new HashSet<>();
//        for(Integer data:datas){
//            StringBuilder binary=new StringBuilder();
//
//            if(data==0){
//                binary.append("0");
//            }
//            else{
//                int num =data;
//                while(num>0){
//                    int kalan=num%2;
//                    binary.append(kalan);
//                    num=num/2;
//                }
//            }
//            binary.reverse();
//         binaries.add(binary.toString());
//
//        }
//
//
//        return binaries;
//    }
    // emre hocanın yöntemi
    public static String convertDecimalToBinary(int decimal){
        LinkedList<Integer> binaryList=new LinkedList<>();
        while(decimal>0){
            int reminder=decimal%2;
            binaryList.addFirst(reminder);//addFirst yapmammızdaki amaç listeye ekleme sırasını reverse yapmadan halletmek binary için çünkü ilk kalan son binary rakamı oluyo
            decimal=decimal/2;
        }
        StringBuilder binaryString=new StringBuilder();
        for(int digit:binaryList){
            binaryString.append(digit);
        }
        return binaryString.toString();
    }


}