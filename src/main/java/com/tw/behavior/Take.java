package com.tw.behavior;

import com.tw.context.GameContext;

public class Take implements BehaviorEvent{
    public void action(GameContext gameContext, Behavior item){
        item.take(gameContext);
    }
}
