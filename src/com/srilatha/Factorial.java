package com.srilatha;

// 5! = 5*4*3*2*!
public class Factorial {
    public static void main(String s[])
    {
        System.out.println(factorial(9));
    }

    public static int factorial(int n){
        // base condition
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }
}
