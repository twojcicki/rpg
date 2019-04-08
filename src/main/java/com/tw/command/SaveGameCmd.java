package com.tw.command;

import com.tw.context.GameContext;

public class SaveGameCmd extends Command {
    public SaveGameCmd(GameContext gameContext) {
        super(gameContext);
    }

    @Override
    public void execute() {
        getGameContext().saveGame();
        getGameContext().showMessage("Game was saved.");
    }

    @Override
    public String getInfo(){
        return "Save game";
    }
}
