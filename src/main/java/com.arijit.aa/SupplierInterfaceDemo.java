package com.arijit.aa;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierInterfaceDemo {
    public static void main(String[] args) {

        // Anonymous Inner Class Example
        Supplier<Integer> supplierA = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 2021;
            }
        };
        System.out.println("Anonymous Inner Class - Present year :" + supplierA.get());

        // Lambda Long syntax
        Supplier<Integer> supplierB = () -> {
            return 2021;
        };
        System.out.println("Lambda long syntax - Present year :" + supplierB.get());

        Supplier<Integer> supplierC = () -> 2021;
        System.out.println("Lambda short syntax - Present year : " + supplierC.get());


        //Example:
        List<Integer> years = Arrays.asList(2019, 2020, 2021, 2022);
        System.out.println(years
                .stream()
                .filter(x -> x.equals(2010))
                .findAny()
                .orElseGet(supplierC));

    }
}
