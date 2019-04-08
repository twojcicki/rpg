package com.tw.command;

import com.tw.character.Character;
import com.tw.context.GameContext;

public class HeroInfo extends Command {

    public HeroInfo(GameContext gameContext) {
        super(gameContext);
    }

    @Override
    public void execute() {
        Character hero = getGameContext().getHero();
        getGameContext().showMessage("Name: {0}", hero.getName());
        getGameContext().showMessage("Health: {0}", hero.getHealth());
        getGameContext().showMessage("Level: {0}", hero.getLevel());
        getGameContext().showMessage("Mana: {0}", hero.getMana());
        getGameContext().showMessage("Power: {0}", hero.getPower());
    }

    @Override
    public String getInfo() {
        return "Information about Hero";
    }
}
