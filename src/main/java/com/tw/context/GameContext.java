package com.tw.context;

import com.tw.character.Character;
import com.tw.gamerule.GameRule;
import com.tw.storage.FileStorage;
import com.tw.storage.Storage;
import com.tw.ui.UserInterface;

import java.io.Serializable;
import java.text.MessageFormat;
import java.util.Scanner;

public class GameContext implements Serializable {
    private transient static GameContext instance;

    private Character hero;
    private final transient Scanner scanner;
    private final transient Storage storage;
    private GameRule gameRule;
    private final transient UserInterface ui;


    private GameContext() {
        scanner = new Scanner(System.in);
        storage = new FileStorage();
        ui = UserInterface.getInstance(this);
    }

    public static GameContext getInstance() {
        if (instance == null) {
            instance = new GameContext();
        }
        return instance;
    }

    public Character getHero() {
        return hero;
    }

    public void setHero(Character hero) {
        this.hero = hero;
    }

    public void saveGame(){
        storage.save(this);
    }

    public void loadGame(){
        GameContext gameContext = storage.load();
        if(gameContext != null) {
            ui.setNewGame();
            this.hero = gameContext.getHero();
            this.gameRule = gameContext.getGameRule();
        }
    }

    public void showMessage(String message, Object... args){
        System.out.println(MessageFormat.format(message, args));
    }
    public void showMessage(String message){
        System.out.println(message);
    }

    public void setGameRule(GameRule gameRule) {
        this.gameRule = gameRule;
    }

    private GameRule getGameRule() {
        return gameRule;
    }

    public boolean isGameEnd(){
        boolean endGame = false;
        if(!hero.isAlive()){
            showMessage("Hero is dead! You lose the game!");
            endGame = true;
        } else if(gameRule.checkEndGame(this)){
            endGame = true;
        }
        return endGame;
    }

    public int getIntUserAnswer(){
        while (!scanner.hasNextInt()) scanner.next();
        return scanner.nextInt();
    }

    public String getStrUserAnswer(){
        while (!scanner.hasNext()) scanner.next();
        return scanner.next();
    }
}
