package com.tw.behavior;

import com.tw.context.GameContext;

public interface BehaviorEvent {

    void action(GameContext gameContext, Behavior item);
}
