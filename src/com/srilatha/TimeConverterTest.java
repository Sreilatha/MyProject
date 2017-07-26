package com.srilatha;

import org.junit.Assert;
import org.junit.Test;
//import java.util.StringTokenizer;

/**
 * Created by Srilatha on 7/12/2017.
 */
public class TimeConverterTest {
    @Test
    public void testTimeconverter(){
        String time="23:10";
        String name=TimeConverter.timeConvertor(time);
        Assert.assertEquals("11:10 PM",name);
    }
}
