package ru.gnome.exercises.chapter3.TestArray;

public class TestArrays {
    public static void main(String[] args) {
        int y = 0;

        String[] islands = new String[4];
        int[] index = new int[4];

        islands[0] = "Бермуды";
        islands[1] = "Фиджи";
        islands[2] = "Азорские острова";
        islands[3] = "Косумель";

        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;
        int ref;
        while (y<4){
            System.out.print("острова = ");
            ref = index[y];

            System.out.println(islands[ref]);
            y = y+1;
        }
    }
}
