package com.arijit.aa;

import java.util.Arrays;
import java.util.List;

// Write a Java 8 program to get the sum of all numbers present in a list;
public class SumAllInListJava8 {

    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(2, 4, 5, 6, 10);

        //Using normal lambda
        Integer sum = numList.stream().reduce(0, (Integer a, Integer b) -> a+b);
        System.out.println(sum);

        //Using Method reference
        Integer sumA = numList.stream().reduce(0, Integer::sum);
        System.out.println(sumA);

    }
}
