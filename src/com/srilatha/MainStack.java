package com.srilatha;

/**
 * Created by Srilatha on 7/26/2017.
 */
public class MainStack {
    public static void main(String[]args){
        Stack stack=new Stack(6);
        stack.push(52);
        stack.push(12);
        stack.push(5);
        stack.push(9);
        stack.push(10);
        stack.push(25);
        while(!stack.isEmpty()){
            long value=stack.pop();
            System.out.println(value);
        }
    }
}
