package com.srilatha;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Srilatha on 6/20/2017.
 */
public class LambdaExpressions {
    public static void main(String[] args) {


        List<String> names = Arrays.asList("jayanth", "vidyuth", "likith");
        List<String> result = names.stream()
                .filter(line -> !"jayanth".equals(line))
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }

}
