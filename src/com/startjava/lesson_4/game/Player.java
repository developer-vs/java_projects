package com.startjava.lesson_4.game;

public class Player {
    
    /*
    
    + перед началом игры выведите сообщение: У вас 10 попыток
    
    + Модифицируйте программу Угадай число, используя для хранения, названных игроками чисел, массивы:
    + Создайте дополнительное поле в классе Player, которое будет хранить введенные пользователем числа
    
    по окончанию игры отобразите, в две строки через пробел, все названные игроками числа
    
    если массив полностью не заполнен, т.е. пользователь угадал число менее чем за 10 попыток,
    то выводить весь массив не нужно
    
    + в конце игры выведите сообщение "Игрок " + имя + " угадал число " + число + " с " + номер + " попытки"
    
    если игроки не угадали число за 10 попыток, то отобразите сообщение: "У " + имя + " закончились попытки"
    
    
    Для считывания части массива используйте метод Arrays.copyOf
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