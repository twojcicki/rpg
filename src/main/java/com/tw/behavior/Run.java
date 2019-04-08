package com.tw.behavior;

import com.tw.context.GameContext;

public class Run implements BehaviorEvent{
    public void action(GameContext gameContext, Behavior item){
        item.run(gameContext);
    }
}
