package com.tw.command;

import com.tw.context.GameContext;

public class CreateHeroCmd extends Command {
    public CreateHeroCmd(GameContext gameContext) {
        super(gameContext);
    }

    @Override
    public void execute() {
        System.out.println("Create hero command!");
    }

    @Override
    public String getInfo(){
        return "Create hero";
    }

}
