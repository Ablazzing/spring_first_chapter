package org.example;

public class Person {
    private Pet pet;
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {

    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callPet(){
        System.out.println("hello my lovely pet");
        pet.say();
    }
}
