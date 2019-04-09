package com.tw.gamerule;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public enum GameRuleType {
    LEVEL_GAIN("Gain level 3", 0, new LevelGain()),
    MONSTER_KILLED("Kill 3 monster", 1, new MonsterKilled());

    private final String description;
    private final int ordinal;
    private final GameRule gameRule;

    GameRuleType(String description, int ordinal, GameRule gameRule) {
        this.gameRule = gameRule;
        this.ordinal = ordinal;
        this.description = description;
    }

    private static Predicate<GameRuleType> byOrdinal(int ordinal) {
        return c -> c.ordinal == ordinal;
    }
    private static Stream<GameRuleType> stream() {
        return Stream.of(GameRuleType.values());
    }

    public static Optional<GameRuleType> getByOrdinal(int ordinal){
        return stream().filter(byOrdinal(ordinal)).findFirst();
    }

    public static String getGameRuleInfo(){
        StringBuilder sb = new StringBuilder();
        stream().forEach(c -> sb.append(c.ordinal).append(" - ").append(c.getInfo()).append("\n"));
        return sb.toString();
    }

    public GameRule getGameRule() {
        return gameRule;
    }

    private String getInfo(){
        return description;
    }
}
