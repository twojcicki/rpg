package com.tw.command;

import com.tw.context.GameContext;

public abstract class Command implements Commandable {
    private GameContext gameContext;

    public Command(GameContext gameContext) {
        this.gameContext = gameContext;
    }

    public GameContext getGameContext() {
        return gameContext;
    }
}
