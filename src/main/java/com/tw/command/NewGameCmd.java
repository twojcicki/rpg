package com.tw.command;

import com.tw.character.CharacterCreator;
import com.tw.character.CharacterType;
import com.tw.context.GameContext;
import com.tw.gamerule.GameRuleType;

import java.util.Optional;

public class NewGameCmd extends Command {
    public NewGameCmd(GameContext gameContext) {
        super(gameContext);
    }

    @Override
    public void execute() {
        getGameContext().showMessage("What is name of your character?");
        String name = getGameContext().getStrUserAnswer();
        getGameContext().showMessage("Choose your type:");
        getGameContext().showMessage(CharacterType.getUserInfo());
        int input = getGameContext().getIntUserAnswer();
        Optional<CharacterType> character = CharacterType.getByOrdinal(input);
        getGameContext().setHero(CharacterCreator.createCharacter(character.orElse(CharacterType.WARRIOR), name, 1));
        getGameContext().showMessage("Choose game rule:");
        getGameContext().showMessage(GameRuleType.getGameRuleInfo());
        input = getGameContext().getIntUserAnswer();
        Optional<GameRuleType> gameRule = GameRuleType.getByOrdinal(input);
        getGameContext().setGameRule(gameRule.isPresent()? gameRule.get().getGameRule() : GameRuleType.LEVEL_GAIN.getGameRule());
        getGameContext().showMessage("New game started!");
    }

    @Override
    public String getInfo(){
        return "Start new game";
    }


}
