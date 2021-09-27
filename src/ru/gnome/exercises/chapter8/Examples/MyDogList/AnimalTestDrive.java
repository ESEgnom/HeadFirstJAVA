package ru.gnome.exercises.chapter8.Examples.MyDogList;

public class AnimalTestDrive {
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog a = new Dog();
        Cat b = new Cat();
        list.add(a);
        list.add(b);
    }
}
