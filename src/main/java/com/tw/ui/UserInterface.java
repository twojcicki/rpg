package com.tw.ui;

import com.tw.command.Commandable;
import com.tw.context.GameContext;

import java.util.Optional;
import java.util.Scanner;

public class UserInterface {
    private static UserInterface instance;
    private Scanner scan;
    private Menu menu;


    private UserInterface(GameContext gameContext) {
        this.scan = new Scanner(System.in);
        this.menu = new Menu(gameContext);
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
        while (!scan.hasNextInt()) scan.next();
        int input = scan.nextInt();
        return menu.getCurrentCommand(input);
    }

}
