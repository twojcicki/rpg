package com.tw.command;

import com.tw.context.GameContext;

public class LoadGameCmd extends Command {
    public LoadGameCmd(GameContext gameContext) {
        super(gameContext);
    }

    @Override
    public void execute() {
        getGameContext().loadGame();
        System.out.println("Game was loaded.");
    }

    @Override
    public String getInfo(){
        return "Load game";
    }
}
