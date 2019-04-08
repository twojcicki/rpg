package com.tw.command;

import com.tw.character.Character;
import com.tw.context.GameContext;

import java.text.MessageFormat;

public class HeroInfo extends Command {

    public HeroInfo(GameContext gameContext) {
        super(gameContext);
    }

    @Override
    public void execute() {
        Character hero = getGameContext().getHero();
        System.out.println(MessageFormat.format("Name: {0}", hero.getName()));
        System.out.println(MessageFormat.format("Health: {0}", hero.getHealth()));
        System.out.println(MessageFormat.format("Level: {0}", hero.getLevel()));
        System.out.println(MessageFormat.format("Mana: {0}", hero.getMana()));
        System.out.println(MessageFormat.format("Power: {0}", hero.getPower()));
    }

    @Override
    public String getInfo() {
        return "Information about Hero";
    }
}
