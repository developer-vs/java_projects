package com.startjava.lesson_2_3.robot;

public class Jaeger {
    
    private String modelName;
    private String mark;
    private String origin;
    private int speed;

    public Jaeger(String modelName, String mark, String origin, int speed) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.speed = speed;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public String checkStatus() {
        switch(mark) {
            case "Mark-1": return mark + " your current status is destroyed";
            case "Mark-5": return mark + " your current status is destroyed";
            default: return mark + " your current status is undefined";
        }
    }

    public void setSpeed(int speed) {
        if(speed > 3 && mark.equals("Mark-1")) {
            System.out.println("Error! " + mark + " your supported speeds are from 1 to 3");
        } else if(speed > 10 && mark.equals("Mark-5")) {
            System.out.println("Error! " + mark + " your supported speeds are from 1 to 10");
        } else {
            this.speed = speed;
        }
    }

    public String getSpeed() {
        return mark + " your current speed is: " + speed;
    }
}