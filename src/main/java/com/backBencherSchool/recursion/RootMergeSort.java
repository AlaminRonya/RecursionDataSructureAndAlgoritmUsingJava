package com.backBencherSchool.recursion;

public class RootMergeSort {
    public static void main(String[] args) {
        int[] data = new int[]{-5,20,10,3,2,0};
        divide(data, 0, data.length-1);
        for (int a: data){
            System.out.print(a+", ");
        }
        System.out.println();
    }
    public static void divide(int[] arr, int start, int end){
        if (start < end){
            int mid = (start+end)/2;
            divide(arr, start, mid);
            divide(arr, mid+1, end);
            conquer(arr, start, mid, end);
        }
    }

    private static void conquer(int[] arr, int start, int mid, int end) {

        int[] temp = new int[end - start + 1];
        int i = start, j = mid+1, k = 0;

        while (i <= mid && j <= end){
            if (arr[i]<= arr[j]){
                temp[k++] = arr[i++];
            }else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid){
            temp[k++] = arr[i++];
        }
        while (j <= end){
            temp[k++] = arr[j++];
        }
        combine(arr, temp, start, end);
    }

    private static void combine(int[] arr, int[] temp, int start, int end) {
        for (int i = start; i <= end; i++){
            arr[i] = temp[i - start];
        }
    }


}
