package com.arijit.aa;

import org.omg.Messaging.SyncScopeHelper;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class testmain {
    public static void main(String[] args) {
        System.out.println(getMessage());
        System.out.println("Okay");

        //Function




        // Rough

        String name = "Arijit";
        System.out.println(name.split("i").toString());

        int val[] = {5, 6, 8, 9, 4};


        //Collectors.toList();
        final List emptyList = Collections.EMPTY_LIST;

        Map<String, BigDecimal> outputMap = new HashMap<>();
        outputMap.containsKey("1524824");

        List<Integer> integerList = new ArrayList<>();
        integerList.size();

        String[] strArr = {"123","def","ghi"};
        int len = strArr.length;
        System.out.println(len);

        System.out.println(Integer.parseInt(strArr[0]));



    }

    public static String getMessage() {
        return "Hello World";
    }


}