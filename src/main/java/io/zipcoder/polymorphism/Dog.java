package io.zipcoder.polymorphism;

public class Dog extends Pet {
    public Dog(){
        super("Cash");

    }

    public Dog(String name){
        super(name);
    }

    public String speak(){
        return "roof";
    }
}
