package com.incha.demo.domain;

public class Person {
    private String name;
    private String age;

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
