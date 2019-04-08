package com.tw.item;

import com.tw.character.Character;
import com.tw.context.GameContext;

public class Ghost extends Monster {

    public Ghost(int level) {
        setName("Ghost");
        setPower((int) (10 * level * Math.random()));
        setHealth((int) (100 * level * Math.random()));
        setLevel(level);
        setMana((int) (100 * level * Math.random()));
    }

    @Override
    public String getInfo() {
        return "You meet a terrible GHOST!";
    }

    protected double countFactor(Character character) {
        return character.getMana() * character.getLevel() * Math.random();
    }

    @Override
    public void run(GameContext gameContext) {
        System.out.println("Run, Forrest, run!");
    }

    @Override
    public void take(GameContext gameContext) {
        gameContext.showMessage("It is not good idea to take ghost. You lose 100 health's points");
        gameContext.getHero().setHealth(gameContext.getHero().getHealth()-100);
    }

    @Override
    public void giveUp(GameContext gameContext) {
        gameContext.showMessage("Ghost casts a charm on you. You lose 50 health's points");
        gameContext.getHero().setHealth(gameContext.getHero().getHealth()-50);
    }
}
