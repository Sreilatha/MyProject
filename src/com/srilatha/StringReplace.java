package com.srilatha;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Srilatha on 6/22/2017.
 */
public class StringReplace {

    public static String rePlace(String name, char letter) {
        List<Character> list=new ArrayList<>();

        for(char c : name.toCharArray()) {
            list.add(c);
        }
         return list.stream().filter(p -> p != letter).map(e->e.toString()).collect(Collectors.joining());

    }
}