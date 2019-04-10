package com.tw.item;

import com.tw.character.Character;
import com.tw.context.GameContext;

public class Dragon extends Monster {

    public Dragon(int level) {
        setName("Dragon");
        setPower((int) (100 * level * Math.random()));
        setHealth((int) (100 * level * Math.random()));
        setLevel(level);
        setMana((int) (10 * level * Math.random()));
    }

    @Override
    public String getInfo() {
        return "You meet a terrible and big DRAGON!";
    }

    protected double countFactor(Character character) {
        return character.getPower() * character.getLevel() * Math.random();
    }

    @Override
    public void run(GameContext gameContext) {
        gameContext.showMessage("Run, Forrest, run!");
    }

    @Override
    public void take(GameContext gameContext) {
        gameContext.showMessage("It is not good idea to take dragon. You lose 100 health's points");
        gameContext.getHero().setHealth(gameContext.getHero().getHealth()-100);
    }

    @Override
    public void giveUp(GameContext gameContext) {
        gameContext.showMessage("Dragon casts a charm on you. You lose 10 health's points");
        gameContext.getHero().setHealth(gameContext.getHero().getHealth()-50);
    }
}
