package com.emard.builders;

import com.emard.builders.models.User;

public class TestBuilder {
    public static void main(String[] args) {
        User james = new User.UserBuilder("James", "Bond")
                .age(45)
                .address("London 123")
                .phoneNumber("123458762")
                .build();
        System.out.println(james);
    }
}
