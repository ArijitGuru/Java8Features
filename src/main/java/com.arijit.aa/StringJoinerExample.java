package com.arijit.aa;

import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {



        /*public StringJoiner(CharSequence delimiter) {
            this(delimiter, prefix, suffix);
        }*/

        //Example with just delimiter
        StringJoiner strJoiner = new StringJoiner(",");
        strJoiner.add("Arijit");
        strJoiner.add("Abhra");
        strJoiner.add("Avik");
        strJoiner.add("Indra");
        strJoiner.add("Debanjan");

        System.out.println(strJoiner);

        //Example with delimiter, prefix and suffix
        StringJoiner stringJoiner1 = new StringJoiner(",", "Roommates are ..: ", ".");
        stringJoiner1.add("Arijit");
        stringJoiner1.add("Abhra");
        stringJoiner1.add("Avik");
        stringJoiner1.add("Indra");
        stringJoiner1.add("Debanjan");

        System.out.println(stringJoiner1);

    }
}
