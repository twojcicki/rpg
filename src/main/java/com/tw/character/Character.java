package com.tw.character;

import java.io.Serializable;

public class Character implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private double power;
    private double mana;
    private int level;
    private double health;
    private int monsterKilled;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void increaseLevel() {
        level++;
        health += 100;
    }

    public int getMonsterKilled() {
        return monsterKilled;
    }

    public void setMonsterKilled(int monsterKilled) {
        this.monsterKilled = monsterKilled;
    }
}
