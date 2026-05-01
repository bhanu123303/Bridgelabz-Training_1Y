package Generics.Five;

class Cat extends Animal {
    Cat(String name){
        super(name);
    }

    void makeSound(){
        System.out.println(name +" meows");
    }
}
