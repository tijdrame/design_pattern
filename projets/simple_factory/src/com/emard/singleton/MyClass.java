package com.emard.singleton;

public class MyClass {
    public static MyClass INSTANCE = new MyClass();
    private MyClass(){}
    public static /*synchronized*/ MyClass getInstance(){
        /*if(INSTANCE == null){
            INSTANCE = new MyClass();
        }*/
        return INSTANCE;
    }
}
