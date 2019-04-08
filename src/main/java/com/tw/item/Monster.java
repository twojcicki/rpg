package com.tw.item;

import com.tw.behavior.Behavior;
import com.tw.character.Character;
import com.tw.context.GameContext;

public abstract class Monster extends Character implements Behavior {

    @Override
    public void fight(GameContext gameContext) {
        do {
            gameContext.showMessage("Fight!");
            double characterResult = countFactor(gameContext.getHero());
            double monsterResult = countFactor(this);
            gameContext.showMessage("Fight factors: for hero {0}, for monster {1}", characterResult, monsterResult);
            gameContext.getHero().setHealth(gameContext.getHero().getHealth() - monsterResult);
            this.setHealth(this.getHealth() - characterResult);
            gameContext.showMessage("Character health: for hero {0}, for monster {1}", gameContext.getHero().getHealth(), this.getHealth());
            if (!gameContext.getHero().isAlive()) {
                gameContext.showMessage("Hero {0} is dead!", gameContext.getHero().getName());
            }
            if (!this.isAlive()) {
                gameContext.showMessage("Monster {0} is dead!", this.getName());
                gameContext.getHero().increaseLevel();
                gameContext.getHero().setMonsterKilled(gameContext.getHero().getMonsterKilled()+1);
            }
        } while (gameContext.getHero().isAlive() && this.isAlive());
    }

    protected abstract double countFactor(Character character);
}
