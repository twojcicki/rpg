package com.tw.command;

public class LoseCmd implements Commandable {
    @Override
    public void execute() {
        System.out.println("You lost the game! Try again later.");
    }

    @Override
    public String getInfo(){
        return "Lost";
    }
}
