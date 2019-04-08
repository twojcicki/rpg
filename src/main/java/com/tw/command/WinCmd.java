package com.tw.command;

public class WinCmd implements Commandable {
    @Override
    public void execute() {
        System.out.println("You win the game! Congratulation!");
    }

    @Override
    public String getInfo(){
        return "Win";
    }
}
