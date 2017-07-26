package com.srilatha;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Srilatha on 7/4/2017.
 */
public class InsertionSortTest {
    @Test
    public void testMethod(){
        int[] ar=InsertionSort.sort(new int[]{6,15,4,28,9});
        Assert.assertArrayEquals(new int[]{4,6,9,15,28},ar);
    }

    @Test
    public void testOneElement(){
        int[] ar=InsertionSort.sort(new int[]{6});
        Assert.assertArrayEquals(new int[]{6},ar);
    }

    @Test
    public void testEmpty(){
        int[] ar=InsertionSort.sort(new int[]{});
        Assert.assertArrayEquals(new int[]{},ar);
    }

    @Test
    public void testNull(){
        int[] ar=InsertionSort.sort(null);
        Assert.assertArrayEquals(null,ar);
    }
}
