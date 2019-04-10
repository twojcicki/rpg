package com.tw.behavior;

import com.tw.context.GameContext;
import com.tw.item.Behavior;

public class GiveUp implements BehaviorEvent{
    public void action(GameContext gameContext, Behavior item){
        item.giveUp(gameContext);
    }
}
