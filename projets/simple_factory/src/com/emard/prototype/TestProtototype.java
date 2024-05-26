package com.emard.prototype;

import com.emard.prototype.model.Dolphin;
import com.emard.prototype.model.Person;

public class TestProtototype {
    public static void main(String[] args) {
        Person bonni = new Person("Bonni", 21);
        System.out.println("Person 1:" + bonni);
        Person nina = (Person) bonni.clone();
        System.out.println("Person 2:" + nina);
        Dolphin jerry = new Dolphin("Jerry", 78);
        System.out.println("Dolphin 1:" + jerry);
        Dolphin sam = (Dolphin)jerry.clone();
        System.out.println("Dolphin 2:" + sam);
    }
}
