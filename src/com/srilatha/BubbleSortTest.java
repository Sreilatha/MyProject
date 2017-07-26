package com.srilatha;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Srilatha on 7/18/2017.
 */
public class BubbleSortTest {
    @Test
    public void bubblesortTest(){
        int [] arr={6,1,3,8,5};
        int[] n=BubbleSort.bubbleSortmethod(arr);
        Assert.assertArrayEquals(new int[]{1,3,5,6,8},n);
    }
}
