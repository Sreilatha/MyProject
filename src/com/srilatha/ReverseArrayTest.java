package com.srilatha;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Srilatha on 6/26/2017.
 */
public class ReverseArrayTest {
    @Test
    public void reverseArrayTestm(){

        int[] in=ReverseArray.reverseMethod(new int[]{1,2,3});
        Assert.assertArrayEquals(new int[]{3,2,1},in);
    } @Test
    public void reverseArrayTestmEvenSized(){

        int[] in=ReverseArray.reverseMethod(new int[]{1,2,3,4});
        Assert.assertArrayEquals(new int[]{4,3,2,1},in);
    }
}
