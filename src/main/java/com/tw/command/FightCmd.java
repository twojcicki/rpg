package com.tw.command;

import com.tw.context.GameContext;

public class FightCmd extends Command {

    public FightCmd(GameContext gameContext) {
        super(gameContext);
    }
    public void execute() {
        System.out.println("Fight command!");
    }

    @Override
    public String getInfo(){
        return "Fight";
    }

}
