package ru.gnome.exercises.chapter4.GoodDog;

public class GoodDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    void bark() {
        if (size > 60) {
            System.out.println("ГАИ! БЛЯ.");
        } else if (size > 14) {
            System.out.println("ГАВ ГАВ");
        } else {
            System.out.println("ТЯФ");
        }
    }
}
