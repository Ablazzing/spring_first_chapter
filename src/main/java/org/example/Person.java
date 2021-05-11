package org.example;

public class Person {
    private Pet pet;

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
