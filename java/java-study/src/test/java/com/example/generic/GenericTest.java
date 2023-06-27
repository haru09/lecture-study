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

/*
* 목적
* 1. JDK1.5에 추가된 제네릭 공부
* 2. 제네릭 컬렉션, 와일드카드, 한정적 와일드카드에 대해 명확히 알고 사용하자
* */

public class GenericTest {

    public static void main(String[] args) {
        AnimalList cat = new AnimalList<Cat>();
        AnimalList dog = new AnimalList<Dog>();
        //AnimalList apple = new AnimalList<Apple>();
    }

}
