package com.backBencherSchool.recursion;

public class RootBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,5,5,5,5,5,5};

        int key = 5;
        int[] value = binarySearch(arr, 0, arr.length-1, key);
        System.out.println("First index of "+value[0]+" and last index of "+value[1]);
        int countOfNumber = (value[1] == -1) ? 0 : (value[1]-value[0])+1;
        System.out.println("Count of items is "+countOfNumber);
    }
    public static int[] binarySearch(int[] arr, int left, int right, int key){
        if (left > right){
            return new int[]{-1, -1};
        }
        int mid = (left+right)/2;

        if (key == arr[mid]){
            int firstIndex = mid;
            int lastIndex = mid;
            System.out.println(mid);
            while (--firstIndex >= 0 && arr[firstIndex] == key){
////                index--;
//                System.out.println("firstIndex=>"+ firstIndex);
            }
            while (++lastIndex < arr.length && arr[lastIndex] == key){
////                index--;
//                System.out.println("lastIndex=>"+ lastIndex);
            }
            return new int[]{firstIndex+1, lastIndex-1};
        }
        if (key < arr[mid]){
            return binarySearch(arr, left, mid-1, key);
        }

        return binarySearch(arr, mid+1, right, key);

    }
}
