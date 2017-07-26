package com.srilatha;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Srilatha on 6/22/2017.
 */
public class StringReplaceTest {
    @Test
    public void stringReplaceTest(){
String str=StringReplace.rePlace("srilatha",'a');
        Assert.assertEquals("srilth",str);
    }
}
