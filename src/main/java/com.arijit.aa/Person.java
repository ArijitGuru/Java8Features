package com.arijit.aa;

import java.util.Objects;

public class Person {
    private String name;
    private String city;
    private String zip;

    public Person(String name, String city, String zip) {
        this.name = name;
        this.city = city;
        this.zip = zip;
    }

    public Person() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) && city.equals(person.city) && zip.equals(person.zip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city, zip);
    }
}
