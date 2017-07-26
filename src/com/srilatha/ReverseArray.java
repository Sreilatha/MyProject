package com.srilatha;

import java.util.Arrays;

/**
 * Created by Srilatha on 6/25/2017.
 */
public class ReverseArray{
    public static int[] reverseMethod(int arr[]){
        int l=arr.length;
        for(int i=0;i<l/2;i++) {
            int temp=0;
            temp=arr[i];
            arr[i] = arr[l-i-1];
             arr[l-i-1]=temp;
        }
        return arr;
    }
}
