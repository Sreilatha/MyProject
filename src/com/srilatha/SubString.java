package com.srilatha;

import java.awt.*;

/**
 * Created by Srilatha on 6/28/2017.
 */
public class SubString {
    public static void main(String[] args) {
        String name1="lalalalilailailaila";
        String subname="la";
        char na[]=name1.toCharArray();
        char subna[]=subname.toCharArray();
        subStringCount(na,subna);
        System.out.println(subStringCount(na,subna));

    }

public static int subStringCount(char[]name,char[]substring){

    int count=0;
    int length=0;
    int length1=0;
    while(length<name.length){
        if(name[length]==substring[length1]){
            if(length1==substring.length-1){
                count++;
                length1=0;
                length++;

            }else{
                length++;
                length1++;
            }

        }else{
            length++;
        }
    }
return count;
}
    }

