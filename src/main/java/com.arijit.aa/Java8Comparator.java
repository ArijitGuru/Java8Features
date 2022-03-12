package com.arijit.aa;

import org.assertj.core.util.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java8Comparator {

    public static void main(String[] args) {
        Person p1 = new Person("Arijit", "Charlotte", "700001");
        Person p2 = new Person("Abhra", "Atlanta", "700001");
        Person p3 = new Person("Arijit", "Kolkata", "100001");
        Person p4 = new Person("Arindam", "Ballantyne", "700011");
        Person p5 = new Person("Avik", "Hickory", "700007");


        List personList = new ArrayList<Person>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);

        personList.forEach(System.out::println);

        //Sort Based on city

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person  o2) {

                int c= o1.getZip().compareTo(o2.getZip());
                if (c==0){
                  c = o1.getCity().compareTo(o2.getCity());
                }
                if (c == 0){
                    c= o1.getName().compareTo(o2.getName());
                }
                return c;
            }
        });

        personList.forEach(System.out::println);

        Comparator<Person> compareByName =  Comparator
                .comparing(Person::getName).thenComparing(Person::getCity);

        //personList.sort((o1, o2) -> {o1.get});

        List<String> humans = Lists.newArrayList(
                new String("Sarah"),
                new String("Jack")
        );

        humans.sort(
                (h1, h2) -> h1.compareTo(h2));

    }
}
