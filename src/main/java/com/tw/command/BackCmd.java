package com.tw.command;

import com.tw.context.GameContext;

public class BackCmd extends Command {

    public BackCmd(GameContext gameContext) {
        super(gameContext);
    }

    @Override
    public void execute() {
        System.out.println("Back!");
    }

    @Override
    public String getInfo(){
        return "Back";
    }
}
