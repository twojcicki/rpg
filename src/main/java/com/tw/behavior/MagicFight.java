package com.tw.behavior;

import com.tw.character.Character;

public class MagicFight extends Fighting {

    @Override
    public double countFactor(Character character) {
        return character.getMana() * character.getLevel() * Math.random();
    }
}
