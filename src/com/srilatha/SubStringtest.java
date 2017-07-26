package com.srilatha;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Srilatha on 7/6/2017.
 */
public class SubStringtest {
    @Test
    public void testmethod(){
        String name="srilathala";
        String subname="la";
        char[]na=name.toCharArray();
        char[]count=subname.toCharArray();
        int i=SubString.subStringCount(na,count);
        Assert.assertSame(i,2);

    }

    @Test
    public void testNoMatch(){
        String name="vidyuth";
        String subname="la";
        char[]na=name.toCharArray();
        char[]count=subname.toCharArray();
        int i=SubString.subStringCount(na,count);
        Assert.assertSame(i,0);

    }

    @Test
    public void testSingleMatch(){
        String name="vidyuth";
        String subname="vidyu";
        char[]na=name.toCharArray();
        char[]count=subname.toCharArray();
        int i=SubString.subStringCount(na,count);
        Assert.assertSame(i,1);

    }
}
