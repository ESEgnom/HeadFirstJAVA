package ru.gnome.exercises.chapter4.Dog;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.name = "Царь";
        dog2.name = "Шарик";
        dog3.name = "Тузик";

        dog1.size = 61;
        dog2.size = 22;
        dog3.size = 14;


        dog2.bark(3);
        dog3.bark(8);
        dog1.bark(1);
    }
}
