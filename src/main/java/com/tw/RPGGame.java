package com.tw;

import com.tw.command.Commandable;
import com.tw.context.GameContext;
import com.tw.ui.UserInterface;

import java.util.Optional;

class RPGGame {
    public static void main(String[] args) {
        GameContext gameContext = GameContext.getInstance();
        UserInterface ui = UserInterface.getInstance(gameContext);

        do{
            gameContext.showMessage(ui.getMenuInfo());
            gameContext.showMessage("Write command: ");
            Optional<Commandable> cmd = ui.getCurrentCommand();
            if(cmd.isPresent()){
                cmd.get().execute();
            }else{
                gameContext.showMessage("Bad command! Try again.");
            }
            if(gameContext.isGameEnd()) {
                System.exit(0);
            }
        } while (true);
    }
}
