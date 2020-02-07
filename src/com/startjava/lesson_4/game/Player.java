package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    
    private String name;
    private int number;
    private int[] enteredNumbers = new int[10];
    
    Player(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public int[] getEnteredNumbers() {
        return enteredNumbers;
    }
    
    public void addEnteredNumber(int counter, int number) {
        enteredNumbers[counter] = number;
    }
    
    public void clearEnteredNumbers(int index) {
        Arrays.fill(enteredNumbers, 0, index,0);
    }
}