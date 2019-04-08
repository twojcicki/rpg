package com.tw.gamerule;

import com.tw.context.GameContext;

public interface GameRule {
    boolean checkEndGame(GameContext gameContext);

}
