package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    
    private Player playerOne;
    private Player playerTwo;
    private int guessNumber;
    private int counter;
    private Scanner scanner = new Scanner(System.in);
    
    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }
    
    public void startGame() {
        guessNumber = (int) (Math.random() * 101);
        System.out.println("Компьютер загадал число: " + guessNumber);

        counter = 0;
        
        while (counter < 10) {
            if (makeMove(playerOne)) {
                counter++;
                break;
            }
            if (makeMove(playerTwo)) {
                counter++;
                break;
            }
            counter++;
        }
        
        if (counter == 10) {
            System.out.println("У " + playerOne.getName() + " закончились попытки");
            System.out.println(Arrays.toString(Arrays.copyOf(playerOne.getEnteredNumbers(), counter)));
            
            System.out.println("У " + playerTwo.getName() + " закончились попытки");
            System.out.println(Arrays.toString(Arrays.copyOf(playerTwo.getEnteredNumbers(), counter)));
        }

        playerOne.clearEnteredNumbers(counter);
        playerTwo.clearEnteredNumbers(counter);
    }

    private boolean makeMove(Player player) {
        inputNumber(player);
        player.addEnteredNumber(counter, player.getNumber());
        return compareNumbers(player);
    }
    
    private void inputNumber(Player player) {
        System.out.print(player.getName() + ", введите ваше число: ");
        player.setNumber(scanner.nextInt());
    }

    private boolean compareNumbers(Player player) {
        if (player.getNumber() > guessNumber) {
            System.out.println(player.getName() + ", введенное вами число больше того, что загадал компьютер");
        } else if (player.getNumber() < guessNumber) {
            System.out.println(player.getName() + ", введенное вами число меньше того, что загадал компьютер");
        } else if (player.getNumber() == guessNumber) {
            System.out.println("Игрок " + player.getName() +
                " угадал число " + player.getNumber() + " с " + (counter + 1) + " попытки");
            return true;
        }
        return false;
    }
}