package Generics.Five;

class Dog extends Animal {
    Dog(String name){
        super(name);
    }

    void makeSound(){
        System.out.println(name + " barks");
    }
}
