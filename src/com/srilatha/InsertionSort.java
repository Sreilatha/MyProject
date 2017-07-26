package com.srilatha;

/**
 * Created by Srilatha on 7/4/2017.
 */
public class InsertionSort {
    public static int[] sort(int[] arr) {
        if ( arr == null ){
            return null;
        }
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j=i-1;
             while(j>=0 &&arr[j]>temp){
               arr[j+1]=arr[j];
             j--;
            }


            arr[j+1]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        return arr;
    }


}
