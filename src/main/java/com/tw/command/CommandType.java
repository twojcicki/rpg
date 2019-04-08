package com.tw.command;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public enum CommandType {
    /*NEW_GAME("Start new game", new NewGameCmd(), "n"),
    CREATE_HERO("Create character", new CreateHeroCmd(), "c"),
    SAVE_GAME("Save game", new SaveGameCmd(), "s"),
    LOAD_GANE("Load game", new LoadGameCmd(), "l"),
    QUIT_GAME("Quit game", new QuitCmd(), "q"),
    FIGHT("Fight!", new FightCmd(), "f"),
    GO("Go to adventure", new GoCmd(), "g"),
    WIN("You win the game!", new WinCmd(), null),

     */
    LOSE("You lost!", new LoseCmd(), null),
    HELP("Show help", new HelpCmd(), "h");

    private String description;
    private Commandable command;
    private String commandKey;

    private static Predicate<CommandType> isCommandForKey(String key)
    {
        return cmd -> key != null && key.equals(cmd.getCommandKey());
    }

    CommandType(String description, Commandable command, String commandKey) {
        this.description = description;
        this.command = command;
        this.commandKey = commandKey;
    }

    public static Stream<CommandType> stream() {
        return Stream.of(CommandType.values());
    }

    public String getDescription() {
        return description;
    }

    public Commandable getCommand() {
        return command;
    }

    public String getCommandKey() {
        return commandKey;
    }

    public static Optional<Commandable> getCommandByKey(String key){
        return CommandType.stream().filter(isCommandForKey(key)).map(cmd -> cmd.getCommand()).findFirst();
    }
}
