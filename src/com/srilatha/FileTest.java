package com.srilatha;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Srilatha on 6/27/2017.
 */
public class FileTest {

    public static void main(String s[]) throws IOException {
        File f = new File("a.txt");
        FileWriter bw = new FileWriter(f);
        bw.write("Hello World text only");

        try{
            if(bw!=null)
                bw.close();
        }catch(Exception ex){
            System.out.println("Error in closing the BufferedWriter"+ex);
        }
    }
}
