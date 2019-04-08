package com.tw.command;

import com.tw.context.GameContext;

public class QuitCmd extends Command {
    public QuitCmd(GameContext gameContext) {
        super(gameContext);
    }

    @Override
    public void execute() {
        getGameContext().showMessage("Game is closing...");
        getGameContext().showMessage("Bye bye!!");
        System.exit(0);
    }

    @Override
    public String getInfo(){
        return "Quit";
    }
}
