package com.tw.behavior;

import com.tw.character.Character;

public class SwordFight extends Fighting {
    @Override
    public double countFactor(Character character) {
        return character.getPower() * character.getLevel() * Math.random();
    }
}
