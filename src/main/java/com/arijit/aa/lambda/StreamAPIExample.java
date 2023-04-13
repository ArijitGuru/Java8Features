package com.arijit.aa.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample {

    public static void main(String[] args) {
        System.out.println("Hello World");

        List<String> name = new ArrayList<String>();
        name.add("abc");
        name.add("");
        name.add("edf");
        name.add("");
        name.add("");
        name.add("fgh");
        List<String> emptyName = name.stream().filter(x -> x.isEmpty()).collect(Collectors.toList());
        System.out.println(emptyName.size());








    }
}


