package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        System.out.println("У вас 10 попыток");
        
        System.out.print("Введите имя первого игрока: ");
        Player p1 = new Player(scan.next());

        System.out.print("Введите имя второго игрока: ");
        Player p2 = new Player(scan.next());

        GuessNumber gn = new GuessNumber(p1, p2);
        String answer = "";

        while(!answer.equals("нет")) {
            gn.startGame();
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scan.next();
            } while(!answer.equals("да") && !answer.equals("нет")) ;
        }
    }
}