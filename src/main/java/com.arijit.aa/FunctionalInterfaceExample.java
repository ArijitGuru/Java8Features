package com.arijit.aa;

import java.util.Arrays;
import java.util.List;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        List<String> nameList = Arrays.asList("Arijit", "Abhra");
        nameList.stream()
                .filter(x -> x.startsWith("A"))
                .sorted()
                .forEach(System.out::print);
    }

}
