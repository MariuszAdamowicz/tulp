package com.mariuszadamowicz.bee;

public class Bee {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new Bee().getGreeting());
    }

}
