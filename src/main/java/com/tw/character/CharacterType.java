package com.tw.character;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public enum CharacterType {
    WARRIOR(1),
    WIZARD(2);

    private final int ordinal;

    private static Predicate<CharacterType> byOrdinal(int ordinal) {
        return c -> c.ordinal == ordinal;
    }

    CharacterType(int ordinal) {
        this.ordinal = ordinal;
    }

    private static Stream<CharacterType> stream() {
        return Stream.of(CharacterType.values());
    }

    public static String getUserInfo(){
        StringBuilder sb = new StringBuilder();
        stream().forEach(c -> sb.append(c.ordinal).append(" - ").append(c.name()).append("\n"));
        return sb.toString();
    }

    public static Optional<CharacterType> getByOrdinal(int ordinal){
        return stream().filter(byOrdinal(ordinal)).findFirst();
    }


}
