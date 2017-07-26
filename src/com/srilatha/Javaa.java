package com.srilatha;
import java.util.Scanner;

/**
 * Created by Srilatha on 6/23/2017.
 */
public class Javaa {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your input" + " ");
        sc.next();
        divide();
    }
    public static int divide(){
        int x=getInt();
        int y=getInt();
        int result=x/y;
   return x/y;
    }
    public static int getInt(){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your number");
    return sc.nextInt();
    }
}
