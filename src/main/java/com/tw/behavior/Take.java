package com.tw.behavior;

import com.tw.context.GameContext;
import com.tw.item.Behavior;

public class Take implements BehaviorEvent{
    public void action(GameContext gameContext, Behavior item){
        item.take(gameContext);
    }
}
