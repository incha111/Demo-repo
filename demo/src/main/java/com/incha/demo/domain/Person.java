package com.incha.demo.domain;

public class Person {
    private String name;
    private String age;
    private String email;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
