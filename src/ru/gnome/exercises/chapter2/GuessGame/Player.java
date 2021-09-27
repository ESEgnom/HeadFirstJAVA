package ru.gnome.exercises.chapter2.GuessGame;

public class Player {
    int num;

    public void guess(){
        num = (int)(Math.random() * 10);
        System.out.println("Я думаю это чисто - "+ num);
    }
}
