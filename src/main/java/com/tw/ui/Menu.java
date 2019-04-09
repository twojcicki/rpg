package com.tw.ui;

import com.tw.command.*;
import com.tw.context.GameContext;

import java.util.Optional;

public class Menu {
    private MenuItem<Commandable> currentLevel;
    private final MenuItem<Commandable> newGame;


    public Menu(GameContext gameContext) {
        MenuItem<Commandable> root = new MenuItem<>(null);
        newGame = root.addChild(new MenuItem<>(new NewGameCmd(gameContext)));
        root.addChild(new MenuItem<>(new LoadGameCmd(gameContext)));
        root.addChild(new MenuItem<>(new QuitCmd(gameContext)));

        newGame.addChild(new MenuItem<>(new GoCmd(gameContext)));
        newGame.addChild(new MenuItem<>(new HeroInfo(gameContext)));
        newGame.addChild(new MenuItem<>(new SaveGameCmd(gameContext)));
        newGame.addChild(new MenuItem<>(new BackCmd(gameContext)));
        currentLevel = root;
    }

    public String getMenuInfo(){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<currentLevel.getChildren().size(); i++){
            sb.append(i).append(" - ").append(currentLevel.getChildren().get(i).getData().getInfo()).append("\n");
        }
        return sb.toString();
    }

    public Optional<Commandable> getCurrentCommand(int commandIndex){
        if(commandIndex<0 || commandIndex>currentLevel.getChildren().size()){
            return Optional.empty();
        }
        MenuItem<Commandable> item = currentLevel.getChildren().get(commandIndex);
        if(item.getData() instanceof BackCmd){
            currentLevel = currentLevel.getParent();
        } else if(item.getChildren().size() > 0) {
            currentLevel = item;
        }
        return Optional.of(item.getData());
    }

    void setNewGame(){
        currentLevel = newGame;
    }
}
