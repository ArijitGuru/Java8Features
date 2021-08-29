package com.arijit.aa;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterfaceDemo {
    public static void main(String[] args) {

        // Using Anonymous Inner Class
        Predicate<Integer> predicateA = new Predicate<Integer>() {
            @Override
            public boolean test(Integer year) {
                return year == 2021 ? true : false;
            }
        };
        System.out.println("Using Anonymous Inner Class  : " + predicateA.test(2020));

        //Using Lambda expression long version
        Predicate<Integer> predicateB = (year) -> {
            return year == 2021 ? true : false;
        };
        System.out.println("Using Lambda long syntax  : " + predicateB.test(2022));

        //Using Lambda expression long version
        Predicate<Integer> predicateC = year -> year == 2021? true : false;
        System.out.println("Using Lambda short syntax  : " + predicateC.test(2021));


        //Example: Stream API .anyMatch() function
        List<Integer> years = Arrays.asList(2019, 2020, 2021, 2022);
        System.out.println("Year 2021 exists? " + years
                .stream()
                .anyMatch(year -> year.equals(2021)));

    }
}
