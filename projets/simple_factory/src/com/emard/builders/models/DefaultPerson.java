package com.emard.builders.models;

import com.emard.builders.interf.Person;

public class DefaultPerson implements Person {
    //Required props
    private final String firstName;
    private final String lastName;
    //Optional props
    protected String phoneNumber;
    protected String address;
    protected int age;
    public DefaultPerson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public DefaultPerson(Builder builder) {
        this(builder.getFirstName(), builder.getLastName());
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
        this.age = builder.age;
    }
    @Override
    public String getFirstName() {
        return this.firstName;
    }
    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    @Override
    public int getAge() {
        return this.age;
    }
    @Override
    public String getAddress() {
        return this.address;
    }
    public static class Builder extends DefaultPerson {
        public Builder(String firstName, String lastName) {
            super(firstName, lastName);
        }

        public Builder phone(String phone){
            this.phoneNumber = phone;
            return this;
        }
        public Builder address(String address){
            this.address = address;
            return this;
        }
        public Builder age(int age){
            this.age = age;
            return this;
        }
        public Person build(){
            return new DefaultPerson(this);
        }
    }

    @Override
    public String toString() {
        return "DefaultPerson{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
