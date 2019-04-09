package com.tw.ui;

import com.tw.command.Commandable;
import com.tw.context.GameContext;

import java.util.Optional;

public class UserInterface {
    private static UserInterface instance;
    private final Menu menu;
    private final GameContext gameContext;


    private UserInterface(GameContext gameContext) {
        this.menu = new Menu(gameContext);
        this.gameContext = gameContext;
    }

    public static UserInterface getInstance(GameContext gameContext) {
        if (instance == null) {
            instance = new UserInterface(gameContext);
        }
        return instance;
    }

    public String getMenuInfo(){
        return menu.getMenuInfo();
    }

    public Optional<Commandable> getCurrentCommand(){
        int input = gameContext.getIntUserAnswer();
        return menu.getCurrentCommand(input);
    }

    public void setNewGame(){
        menu.setNewGame();
    }

}
