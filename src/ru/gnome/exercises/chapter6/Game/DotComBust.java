package ru.gnome.exercises.chapter6.Game;

import java.util.ArrayList;

public class DotComBust {
    /**
     * Объявляем и инициализируем переменные,которые нам понадобятся
     */
    private GameHelper helper  = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame(){
        /**
         * Создаем три объекта DotCom даем им именаи помещаем в ArrayList.
         */
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        /**
         * Выводим краткие инструкции для пользователя.
         */
        System.out.println("Ваша цель - потопить три \"Сайта\"");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");

        /**
         * Повторяем с каждым объектом DotCom в спимске.
         */
        for (DotCom dotComToSet : dotComsList){

            /**
             * Запрашиваем у вспомогательного объекта адрес "сайта"
             */
            ArrayList<String> newLocation = helper.placeDotCom(3);
            /**
             * вызываем сеттер из объекта DotCom, чтобы передать ему местоположение, которое
             * только что получили от вспомогательного объеката.
             */
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying(){
        while (!dotComsList.isEmpty()){
            /**
             * До тех пор, пока список объектов DotCom не станет пустым, получаем
             * пользовательский ввод.
             */
            String userGuess = helper.getUserInput("Сделайте ход");
            /**
             * Вызываем наш метод checkUserGuess
             */
            checkUserGuess( userGuess);
        }
        /**
         * вызываем наш метод finishGame.
         */
        finishGame();
    }

    private void checkUserGuess(String userGuess){
        /**
         * Инкрементируем колличество попыток которые сделал пользователь.
         */
        numOfGuesses++;
        /**
         * Подразумеваем промах пока не выясним обратного.
         */
        String result = "Мимо";
        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(userGuess);
            if(result.equals("Попал")){
                break;                            //выбираемся из цикла раньше времен, нет смысла
            }                                     //проверять другие "сайты"
            if(result.equals("Потопил")){
                dotComsList.remove(dotComToTest);//Ему пришел конец, так что удаляем его из списка
                break;                           //"сайтов" и выходим из цикла.
            }
        }
        System.out.println(result);              //Выводим для пользователя результат
    }

    private  void finishGame(){             //выводим сообщение о том как пользователь прошел игру
        System.out.println("Все сайты ушли ко дну! Ваши акции теперь ничего не стоят.");
        if(numOfGuesses <= 18){
            System.out.println("Это заняло у вас всего"+ numOfGuesses+ " попыток");
            System.out.println("Вы успели выбраться до того как ваши вложения утонули.");
        }else{
            System.out.println("Это заняло у вас довольно много времени"+ numOfGuesses+ " попыток");
            System.out.println("Рыбы водят хороводы вокруг ваших вложений");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();  //создаем игровой объект
        game.setUpGame();   //Говорим игровому объекту подготовить игру.
        game.startPlaying();    //Говорим игровому объекту начать главный игровой цикл
    }

}
