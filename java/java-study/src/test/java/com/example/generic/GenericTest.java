package com.example.generic;

class AnimalList<T extends Animal>{

}

interface Animal {
    public abstract void cry();
}

class Cat implements Animal {

    @Override
    public void cry() {
        System.out.println("야옹");
    }
}

class Dog implements Animal {

    @Override
    public void cry() {
        System.out.println("멍멍");
    }
}

class Apple {

}

public class GenericTest {


    public static void main(String[] args) {
        AnimalList cat = new AnimalList<Cat>();
        AnimalList dog = new AnimalList<Dog>();
        AnimalList apple = new AnimalList<Apple>();
    }

}
