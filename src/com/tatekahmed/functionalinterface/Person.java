package com.tatekahmed.functionalinterface;

/**
 * @author tatek on 7/3/2023
 */
public class Person {

    private String name;

    int enroll = 0;

    public Person(String name){
        this.name = name;
        setEnroll(enroll);
    }

    private void setEnroll(int i) {
        enroll++;
    }
    private int getEnroll() {
        return enroll++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getEnroll()+ ": "+ getName();
    }
}
