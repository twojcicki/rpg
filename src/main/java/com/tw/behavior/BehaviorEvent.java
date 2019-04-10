package com.tw.behavior;

import com.tw.context.GameContext;
import com.tw.item.Behavior;

public interface BehaviorEvent {

    void action(GameContext gameContext, Behavior item);
}
