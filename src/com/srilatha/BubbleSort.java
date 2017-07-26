package com.srilatha;

/**
 * Created by Srilatha on 7/18/2017.
 */
public class BubbleSort {
    public static void main(String[] args){
        int[] l={9,3,2,5,1};


        bubbleSortmethod(l);
        for(int i=0;i<5;i++){
            System.out.println(l[i]+"");
        }

    }
    public static int[] bubbleSortmethod(int[]arr){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<(arr.length-i);j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;

    }
}
