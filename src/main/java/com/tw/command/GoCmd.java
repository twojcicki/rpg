package com.tw.command;

import com.tw.item.Behavior;
import com.tw.behavior.BehaviorType;
import com.tw.context.GameContext;
import com.tw.item.ItemCreator;

import java.util.Optional;

public class GoCmd extends Command {
    public GoCmd(GameContext gameContext) {
        super(gameContext);
    }

    @Override
    public void execute() {
        Behavior item = ItemCreator.createItem(getGameContext().getHero().getLevel());
        getGameContext().showMessage(item.getInfo());
        getGameContext().showMessage("What do you do?");
        getGameContext().showMessage(BehaviorType.getUserInfo());
        int input = getGameContext().getIntUserAnswer();
        BehaviorType.getByOrdinal(input);
        Optional<BehaviorType> behavior = BehaviorType.getByOrdinal(input);
        behavior.ifPresent(b -> b.getEvent().action(getGameContext(), item));
    }

    @Override
    public String getInfo(){
        return "Go ahead!";
    }
}
