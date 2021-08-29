package com.arijit.aa;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceDemo {

    public static void main(String[] args) {

        // Anonymous Inner class syntax
        Consumer<String> consumerA = new Consumer<String>(){
            @Override
            public void accept(String str) {
                System.out.println("Printing Example : " + str);
            }
        };
        consumerA.accept("Using Anonymous Inner class");

        // Using Lambda long syntax
        Consumer<String> consumerB = (str) -> {
                System.out.println("Printing Example : " + str);
            };
        consumerB.accept("Using Lambda long syntax");

        // Using Lambda short syntax
        Consumer<String> consumerC = str -> System.out.println("Printing Example : " + str);
        consumerC.accept("Using Lambda short syntax");


        //Example: forEach Method
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5);
        numList.stream().forEach(num -> System.out.print(num + " "));

    }
}
