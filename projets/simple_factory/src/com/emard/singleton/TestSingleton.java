package com.emard.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        MyClass myClass1 = MyClass.getInstance();
        MyClass myClass2 = MyClass.getInstance();
        System.out.println(myClass2==myClass1);
    }
}
