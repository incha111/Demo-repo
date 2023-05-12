package com.incha.demo.domain;

public class Person {
    private String name;
    private String age;
    private String nickName;
    private String email;
    private String nickName;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public Person(String name, String age, String nickName) {
        this.name = name;
        this.age = age;
        this.nickName = nickName;
    }
}
