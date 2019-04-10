package com.tw.behavior;

import com.tw.context.GameContext;
import com.tw.item.Behavior;

public class Fight implements BehaviorEvent{

    public void action(GameContext gameContext, Behavior item){
        item.fight(gameContext);
    }
}
