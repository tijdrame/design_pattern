package com.emard.singleton;

public class MyClass {
    private static volatile  MyClass INSTANCE;
    private MyClass(){}
    //Double check locking
    public static  MyClass getInstance(){
        if(INSTANCE == null){
            synchronized ((MyClass.class)){
                if(INSTANCE == null){
                    INSTANCE = new MyClass();
                }
            }

        }
        return INSTANCE;
    }
}
