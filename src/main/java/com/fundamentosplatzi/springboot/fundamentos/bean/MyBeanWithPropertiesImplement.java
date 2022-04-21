package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanWithPropertiesImplement implements MyBeanWithProperties {

    private String firstName;
    private String lastName;

    public MyBeanWithPropertiesImplement(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String function() {
        return this.firstName + " "+this.lastName;
    }
}
