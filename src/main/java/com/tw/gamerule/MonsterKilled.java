package com.tw.gamerule;

import com.tw.context.GameContext;

public class MonsterKilled implements GameRule {
    private final int monsterKilled = 3;


    @Override
    public boolean checkEndGame(GameContext gameContext) {
        boolean levelGain = false;
        if(gameContext.getHero().isAlive() && gameContext.getHero().getMonsterKilled() == monsterKilled){
            levelGain = true;
            gameContext.showMessage("You have killed {0} monster and you WIN the game!", monsterKilled);
        }
        return levelGain;
    }
}
