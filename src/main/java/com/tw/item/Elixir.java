package com.tw.item;

import com.tw.behavior.Behavior;
import com.tw.context.GameContext;

public class Elixir implements Behavior {
    @Override
    public String getInfo() {
        return "You find a bottle with ELIXIR!";
    }

    @Override
    public void fight(GameContext gameContext) {
        gameContext.showMessage("You fight with elixir and break it.");
    }

    @Override
    public void run(GameContext gameContext) {
        gameContext.showMessage("Run, Forrest, run!");
    }

    @Override
    public void take(GameContext gameContext) {
        gameContext.showMessage("You drink elixir, which recover you 50 health point.");
        gameContext.getHero().setHealth(gameContext.getHero().getHealth()+50);
    }

    @Override
    public void giveUp(GameContext gameContext) {
        gameContext.showMessage("You go further.");
    }
}
