package com.tw.character;

public class Wizard extends Character {

    public Wizard(String name, int level) {
        setName(name);
        setPower(10 * level);
        setHealth(80 * level);
        setLevel(level);
        setMana(100 * level);
    }

    public void increaseLevel() {
        super.increaseLevel();
        setPower(getPower() + 10);
        setMana(getMana() + 100);
    }
}
