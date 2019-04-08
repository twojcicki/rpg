package com.tw.command;

public class QuitCmd implements Commandable {
    @Override
    public void execute() {
        System.out.println("Game is closing...");
        System.out.println("Bye bye!!");
        System.exit(0);
    }

    @Override
    public String getInfo(){
        return "Quit";
    }
}
