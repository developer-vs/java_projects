package com.startjava.lesson_1.game;

public class GuessNumber {

    public static void main(String[] args) {
        int guessNumber = 30;
        int myNumber = 28;
        
        while(myNumber != guessNumber) {
            if(myNumber > guessNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
                myNumber--;
            }
        
            if(myNumber < guessNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
                myNumber++;
            }
        }
        
        System.out.println("Вы угадали!");
    }
}
