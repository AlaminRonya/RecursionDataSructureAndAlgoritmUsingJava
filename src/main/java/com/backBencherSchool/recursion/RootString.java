package com.backBencherSchool.recursion;

public class RootString {
    public static void main(String[] args) {
        System.out.println(reverseString("alamin"));
        System.out.println("Palindrome: "+palindromeOfString("abaa"));
//        for (int i = 0; i <= 15 ; i++)
//            System.out.println("Decimal To Binary : "+findBinary(i));

        System.out.println("Decimal To Binary : "+findBinary(999999999, ""));
    }

    public static String reverseString(String str){
        if (str.equals("")){
            return "";
        }
        return reverseString(str.substring(1))+str.charAt(0);
    }

    public static boolean palindromeOfString(String str){
        if (str.length() == 0 || str.length() == 1){
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length()-1)){
            return palindromeOfString(str.substring(1, str.length()-1));
        }
        return false;
    }

    public static String findBinary(Integer decimal, String result){
        if (decimal == 0){
            return result;
        }
        result = decimal%2 + result;
        return findBinary(decimal/2, result) ;
    }
}
