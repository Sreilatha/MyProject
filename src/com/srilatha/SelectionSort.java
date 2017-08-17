package com.srilatha;

public class SelectionSort {
    public static void main(String[] args){
        int[] array=selectionSort(new int[]{11,9,3,6,14,34});
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }



    public static int[] selectionSort(int[] a){
        for(int i=0;i<a.length;i++){
            int minimum=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[minimum]){
                    minimum=j;
                }
            }
            int temp=a[i];
            a[i]=a[minimum];
            a[minimum]=temp;
        }
        return a;
    }
}
