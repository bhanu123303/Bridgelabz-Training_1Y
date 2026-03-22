package com.gla.Inheritance;

public class Runner {
    public static void main(String[] args) {
        Animal d=new Dog("Bruno",3);
        Animal c=new Cat("Kitty",2);

        d.makeSound();
        c.makeSound();
    }

}
