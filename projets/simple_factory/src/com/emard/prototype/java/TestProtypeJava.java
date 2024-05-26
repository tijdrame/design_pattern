package com.emard.prototype.java;

import com.emard.prototype.java.model.Person;

public class TestProtypeJava {
    public static void main(String[] args) {
        Person person = new Person("James", 45);
        System.out.println("Person 1:" + person);
        Person secondPerson = (Person) person.clone();
        System.out.println("Person 2:" + secondPerson);
        System.out.println(System.identityHashCode(person)+" "+System.identityHashCode(secondPerson));

    }
}
