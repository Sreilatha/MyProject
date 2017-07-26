package com.srilatha;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Srilatha on 6/26/2017.
 */
public class JclassTest {
    @Test
    public void jtest() {
        int[] ar = {2, 3, 5, 6};
        Jclass.method(ar);
        Assert.assertArrayEquals(new int[]{6,5,3,2,},ar);

    }
}