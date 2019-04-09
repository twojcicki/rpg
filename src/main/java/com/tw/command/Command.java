package com.tw.command;

import com.tw.context.GameContext;

abstract class Command implements Commandable {
    private final GameContext gameContext;

    Command(GameContext gameContext) {
        this.gameContext = gameContext;
    }

    GameContext getGameContext() {
        return gameContext;
    }
}
