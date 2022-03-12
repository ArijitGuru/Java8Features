package com.arijit.aa;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedListExample {


    public static void main(String[] args) {

        List nameList = new LinkedList<String>();
        nameList.add("Arijit");
        nameList.add("Adhikary");

        nameList.forEach(System.out::println);

        nameList.stream().map(word -> new StringBuilder((String) word).reverse()).
        forEach(System.out::println);





    }
}
