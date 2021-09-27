package ru.gnome.exercises.chapter4.Dog;

public class Dog {
    int size;
    String name;

    void bark(int numOfBarks){

        while (numOfBarks>0){
            if(size>60){
                System.out.print("ГАВ.БЛЯТЬ");
            }else if(size>14){
                System.out.print("ГАВ ГАВ ");
            }else{
                System.out.print("ТЯВ");
            }

            numOfBarks = numOfBarks-1;
        }
        System.out.println();
    }
}
