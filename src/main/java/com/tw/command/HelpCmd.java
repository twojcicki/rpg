package com.tw.command;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.function.Predicate;

public class HelpCmd implements Commandable {
    private Predicate<CommandType> withKey = cmd -> cmd.getCommandKey() != null;

    @Override
    public void execute() {
        System.out.println("-------HELP-------");
        Arrays.stream(CommandType.values()).filter(withKey).forEach(cmd -> {
            System.out.println(MessageFormat.format("Key: {0} - {1}", cmd.getCommandKey(), cmd.getDescription()));
        });
        System.out.println("-----HELP-END-----");
    }

    @Override
    public String getInfo(){
        return "Help";
    }
}
