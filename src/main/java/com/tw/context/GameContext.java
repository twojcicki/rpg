package com.tw.context;

import com.tw.character.Character;
import com.tw.character.CharacterCreator;
import com.tw.character.CharacterType;
import com.tw.gamerule.GameRule;
import com.tw.storage.FileStorage;
import com.tw.storage.Storage;

import java.text.MessageFormat;
import java.util.Scanner;

public class GameContext {
    private static GameContext instance;

    private Character hero;
    private Scanner scanner;
    private Storage storage;
    private GameRule gameRule;


    private GameContext() {
        scanner = new Scanner(System.in);
        storage = new FileStorage();
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
        storage.save(hero);
    }

    public void loadGame(){
        hero = storage.load().orElse(CharacterCreator.createCharacter(CharacterType.WARRIOR, "Player",1));
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
