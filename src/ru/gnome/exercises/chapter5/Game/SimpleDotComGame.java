package ru.gnome.exercises.chapter5.Game;

import ru.gnome.exercises.chapter6.Game.GameHelper;

public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);
        int[] location = {randomNum, randomNum+1, randomNum+2};
        theDotCom.setLocationCell(location);

        boolean isAlive = true;

        while (isAlive ==true){
            String guess = helper.getUserInput("Введите число");
            String result = theDotCom.checkYourSelf(guess);
            numOfGuesses++;
            if(result.equals("Потопил")){
                System.out.println("Вам потребовалось "+ numOfGuesses + " попыток");
            }
        }
    }
}
