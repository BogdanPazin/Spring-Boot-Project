package com.luv2code.springcoredemo.common;

public class SwimCoach implements Coach{

    public SwimCoach() {
        System.out.println("In the constructor for swim coach");
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1km for a warm-up";
    }
}
