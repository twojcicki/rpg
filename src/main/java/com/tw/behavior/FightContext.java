package com.tw.behavior;

import com.tw.character.Character;

public class FightContext {
    private Behavior behavior;

    public void setFighting(Behavior behavior) {
        this.behavior = behavior;
    }

    public void action(Character character, Character monster) {
        //behavior.action();
    }
}
