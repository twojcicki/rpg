package com.tw.gamerule;

import com.tw.context.GameContext;

public class LevelGain implements GameRule {
    @Override
    public boolean checkEndGame(GameContext gameContext) {
        int level = 3;
        boolean levelGain = false;
        if(gameContext.getHero().isAlive() && gameContext.getHero().getLevel() == level){
            levelGain = true;
            gameContext.showMessage("You gain {0} level and you WIN the game!", level);
        }
        return levelGain;
    }
}
