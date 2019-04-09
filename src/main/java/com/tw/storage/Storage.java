package com.tw.storage;

import com.tw.context.GameContext;

public interface Storage {

    void save(GameContext gameContext);
    GameContext load();
}
