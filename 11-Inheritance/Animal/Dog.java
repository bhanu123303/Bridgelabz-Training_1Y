package com.gla.Inheritance;

public class Dog extends Animal {
    public Dog(String name,int age){
        super(name,age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + "(Dog) says woof" );
    }
}
