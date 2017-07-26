package com.srilatha;

/**
 * Created by Srilatha on 6/21/2017.
 */
public class Palindrome {

        public static void main(String[] args){
            String str="MalayalaM";
            String restr="";
            for(int i=str.length()-1;i>=0;i--) {
                restr += str.charAt(i);
            }
            System.out.println(restr);
            if(restr.equalsIgnoreCase(str)) {
                System.out.println("This string is a palindrome");
            }else
                System.out.println("Its not a palindrome");
        }

}
