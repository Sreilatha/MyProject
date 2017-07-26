package com.srilatha;

/**
 * Created by Srilatha on 6/26/2017.
 */
public class Jclass {
    public static void main(String[] args){
        Jclass j=new Jclass();
        int []a={1,3,5,7};
        j.method(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
    public static void method(int[] arr){
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=0;
            temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;

        }
    }
}
