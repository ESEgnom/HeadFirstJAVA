package ru.gnome.exercises.chapter4.EectricGuitar;

public class EectricGuitar {
    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;

    String getBrand() {
        return brand;
    }
    void setBrand(String aBrand){
        brand = aBrand;
    }
    int getNumOfPickups(){
        return numOfPickups;
    }
    void setNumOfPickups(int num){
        numOfPickups = num;
    }
    boolean getRockStarUsesIt(){
        return rockStarUsesIt;
    }
    void setRockStarUsesIt(boolean yesOrNO){
        rockStarUsesIt = yesOrNO;
    }
}
