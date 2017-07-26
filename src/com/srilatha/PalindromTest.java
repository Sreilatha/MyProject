package com.srilatha;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Srilatha on 6/22/2017.
 */
public class PalindromTest {

    @Test
    public void testPalindrom(){
        // Data setup
        String palindrome = "abcdefedcba";
        // Test
        boolean isPalindrom = Palindromej.palindrome(palindrome);
        // Assert
        Assert.assertTrue(isPalindrom);
        // Teardown
    }

    @Test
    public void testNotPalindrom(){
        // Data setup
        String palindrome = "abcdefedcb";
        // Test
        boolean isPalindrom = Palindromej.palindrome(palindrome);
        // Assert
        Assert.assertFalse(isPalindrom);
        // Teardown
    }

    @Test
    public void testnotNullPalindrom(){
        // Data setup
        String palindrome = null;
        // Test
        boolean isPalindrom = Palindromej.palindrome(palindrome);
        // Assert
        Assert.assertFalse(isPalindrom);
        // Teardown
    }

    @Test
    public void testnotEmptyPalindrom(){
        // Data setup
        String palindrome = "";
        // Test
        boolean isPalindrom = Palindromej.palindrome(palindrome);
        // Assert
        Assert.assertFalse(isPalindrom);
        // Teardown
    }
}
