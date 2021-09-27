package ru.gnome.exercises.chapter1;

public class MyFirstApp {

    public static void main(String[] args) {
        doMyFirstApp();
        System.out.println();
        //doLoopy();
        System.out.println();
        doTest();

    }

    public static void doMyFirstApp(){
        System.out.println("Я управляю");
        System.out.println("миром");
    }

    public static void doLoopy(){
        int x = 1;
        System.out.println("Перед циклом");
        while (x<4){
            System.out.println("Внутри цикла");
            System.out.println("Значение х равно: "+ x);
            x = x+1;
            System.out.println("После окончания цикла");
        }
    }

    public static void doTest(){
        int x=0;
        int y=0;
        while (x<5){
            x = x+1;
            y = y+x;
            System.out.print(x+ ""+ y+ " ");
            x = x+1;
        }
    }
}
