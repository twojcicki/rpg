package com.tw.command;

import com.tw.context.GameContext;

public class SaveGameCmd extends Command {
    public SaveGameCmd(GameContext gameContext) {
        super(gameContext);
    }

    @Override
    public void execute() {
        getGameContext().saveGame();
        System.out.println("Game was saved.");
    }

    @Override
    public String getInfo(){
        return "Save game";
    }
}
