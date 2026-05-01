package Generics.Five;

import java.util.*;
class Animal {
    String name;

    Animal(String name){
        this.name = name;
    }

    void makeSound(){
        System.out.println(name+" makes a sound");
    }
}
