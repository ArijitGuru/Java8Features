package com.arijit.aa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressionComparableImplementation {
    private List<Person> personList;


    public static void main(String[] args) {

        //Using general Anonymous Comparator
        LambdaExpressionComparableImplementation example = new LambdaExpressionComparableImplementation();
        example.personList = example.populatePersons();
        Collections.sort(example.personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        //Display
        for (Person p : example.personList){
            System.out.println(p.toString());
        }
        System.out.println();

        // Using Lambda Expression
        Collections.sort(example.personList, ((o1, o2) -> o2.getName().compareTo(o1.getName())));

        //Display
        for (Person p : example.personList){
            System.out.println(p.toString());
        }



    }





    public List <Person> populatePersons(){
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Arijit", "Charlotte", "900137"));
        personList.add(new Person("Arindam", "Charlotte", "900137"));
        personList.add(new Person("Abhra", "Charlotte", "900137"));
        personList.add(new Person("Debanjan", "Dallas", "211137"));
        return personList;
    }
}
