package com.srilatha;

/**
 * Created by Srilatha on 6/21/2017.
 */
public class Palindromej {

    public static boolean palindrome(String str) {
        if (str == null || str == "")
            return false;
        int length = str.length();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < length; i++) {
            if (charArray[i] != charArray[(length - 1) - i]) {
                System.out.println("This is not palindrome" + " " + str);

                return false;
            }

        }
        System.out.println("This is a palindrome" + " " + str);
        return true;
    }
}
