package com.jedy.coredsa.playground;

public class Person {
    
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if(age < 0){
            System.out.println("Age can't be negative");
            return;
        }
        
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
