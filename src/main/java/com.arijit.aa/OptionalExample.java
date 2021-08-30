package com.arijit.aa;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) throws Exception {
        Person personA = new Person("Arijit", "Charlotte", "987654");
        Person personB = new Person("Abhra", null, "987654");

        //print city name in uppercase
        //System.out.println("City in uppercase : " + personB.getCity().toUpperCase()); // throws NPE

        //Avoid NPE
        Optional<String> opCity = Optional.ofNullable(personB.getCity());
        // 3 ways to create Optional container object
        //.of
        //.empty()
        //.ofNullable()
        System.out.println(opCity.isPresent());
        System.out.println(opCity.orElse("Default value"));

        //Throw Exception
        System.out.println(opCity
                .orElseThrow(() -> new Exception("Value is null")));


        //Recommended
        //Add Optional<String> in VO or POJO getters() instead of using primitive String
    }
}
