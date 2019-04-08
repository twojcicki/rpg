package com.tw.character;

public class Warrior extends Character {

    public Warrior(String name, int level) {
        setName(name);
        setPower(100 * level);
        setHealth(100 * level);
        setLevel(level);
        setMana(10 * level);
    }

    public void increaseLevel() {
        super.increaseLevel();
        setPower(getPower() + 100);
        setMana(getMana() + 10);
    }
}
