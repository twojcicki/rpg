package com.tw.behavior;

import com.tw.context.GameContext;

public class GiveUp implements BehaviorEvent{
    public void action(GameContext gameContext, Behavior item){
        item.giveUp(gameContext);
    }
}
