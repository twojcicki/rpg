package com.tw.gamerule;

import com.tw.context.GameContext;

import java.io.Serializable;

public interface GameRule extends Serializable {
    boolean checkEndGame(GameContext gameContext);

}
