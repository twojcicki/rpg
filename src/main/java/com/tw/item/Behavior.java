package com.tw.item;

import com.tw.context.GameContext;

public interface Behavior {
    String getInfo();
    void fight(GameContext gameContext);
    void run(GameContext gameContext);
    void take(GameContext gameContext);
    void giveUp(GameContext gameContext);
}
