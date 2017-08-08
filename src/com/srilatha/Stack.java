package com.srilatha;

/**
 * Created by Srilatha on 7/26/2017.
 */
public class Stack {
    private int maxsize;
    private long[] stackarray;
    private int top;
    public Stack(int size){
        this.maxsize=size;
        this.stackarray=new long[maxsize];
        this.top=-1;
    }
    public void push(long j){
        top++;
        stackarray[top]=j;
    }
    public long pop(){
        int old_top=top;
        top--;
                return stackarray[old_top];
    }
    public boolean isEmpty(){
        return(top==-1);
    }
}
