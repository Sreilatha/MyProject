package com.srilatha;
import java.io.FileReader;
import java.io.FileNotFoundException;

/**
 * Created by Srilatha on 6/19/2017.
 */
public class CatchTry {
    public static void main(String[] args){
        CatchTry ct=new CatchTry();
        ct.accessFile();

    }
public void accessFile(){
        try{
            FileReader fr=new FileReader("Test");
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("This is my output");
        }
}
}
