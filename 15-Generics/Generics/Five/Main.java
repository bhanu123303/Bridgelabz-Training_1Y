package Generics.Five;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void printAnimals(List<? extends Animal> animals){
        for(Animal a : animals){
            a.makeSound();
        }
    }

    public static void main(String[] args){
        List<Dog> dogs = Arrays.asList(
                new Dog("Tommy"),
                new Dog("Bruno")
        );

        List<Cat> cats = Arrays.asList(
                new Cat("Kitty"),
                new Cat("Luna")
        );

        printAnimals(dogs);
        printAnimals(cats);
    }
}
