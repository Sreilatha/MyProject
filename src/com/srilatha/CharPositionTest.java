package com.srilatha;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Srilatha on 6/23/2017.
 */
public class CharPositionTest {
    @Test
    public void charPositiontest() {
        CharPosition cc = new CharPosition();
       Integer[] result = cc.charPosition("jayanth",'t');
        Assert.assertArrayEquals(new Integer[]{6},result);

    }
}