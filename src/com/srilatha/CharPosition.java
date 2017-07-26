package com.srilatha;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Srilatha on 6/23/2017.
 */

/*

sadfsadfasdf
asdfas
asdfasdf


 */
public class CharPosition {
    public static void main(String[] args){
        charPosition("srilatha",'t');

    }

    public static Integer[] charPosition(String name, char letter) {
        List<Integer> list=new ArrayList<>();
        int length = name.length();
        for (int i = 0; i < length; i++) {
            if (letter == name.charAt(i)){
                list.add(i+1);
            }
        }
        Integer[] return_value = new Integer[list.size()] ;
        return list.toArray(return_value);
    }


}

