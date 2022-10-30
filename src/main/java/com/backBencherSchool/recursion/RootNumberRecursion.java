package com.backBencherSchool.recursion;

public class RootNumberRecursion {
    private static long[] fibonacciCache;
    public static void main(String[] args) {
        Integer value = recursiveSummation(5);
        System.out.println(value);

        int n = 10;
        fibonacciCache = new long[n+1];

        System.out.println(gcd(-10,2));
    }
    public static Integer recursiveSummation(Integer number){
        if (number <= 1){
            return number;
        }
        return number + recursiveSummation(number-1);
    }

    public static long fibonacciNonOptimized(int number){
        if (number <= 1 ){
            return number;
        }
        return fibonacciNonOptimized(number-1)+fibonacciNonOptimized(number-2);
    }

    public static long fibonacciOptimized(int number){
        if (number <= 1){
            return number;
        }
        if (fibonacciCache[number] != 0){
            return fibonacciCache[number];
        }
        long nThFibonacciNumber = fibonacciNonOptimized(number-1)+fibonacciNonOptimized(number-2);
        fibonacciCache[number] = nThFibonacciNumber;

        return nThFibonacciNumber;
    }
    public static int gcd(int n , int m){
        return (m == 0) ? n : gcd(m, n % m);
    }
}
