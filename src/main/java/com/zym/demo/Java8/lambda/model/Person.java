package com.zym.demo.Java8.lambda.model;

public class Person {

    private String name;

    private int age;

    private String id;

    private Boolean isBoy;

    public boolean isBoy() {
        return isBoy;
    }

    public void setBoy(boolean boy) {
        isBoy = boy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Person(String name, int age, String id,Boolean isBoy) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.isBoy = isBoy;
    }
}
