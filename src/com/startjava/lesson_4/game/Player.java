package com.startjava.lesson_4.game;

public class Player {
    
    /*
    Для обнуления массивов игроков, при повторном запуске игры, используйте метод Arrays.fill().
    При этом обнуляйте только те ячейки, где хранятся, названные игроками числа
     */

    private String name;
    private int number;
    private int[] enteredNumbers = new int[10];

    Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    
    public int[] getEnteredNumbers() {
        return enteredNumbers;
    }
    
    public void setEnteredNumbers(int counter, int number) {
        enteredNumbers[counter] = number;
    }
}