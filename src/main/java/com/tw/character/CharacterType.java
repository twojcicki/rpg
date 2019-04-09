package com.tw.character;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public enum CharacterType {
    WARRIOR(true, 1),
    WIZARD(true, 2),
    GHOST(false, 3),
    DRAGON(false, 4);

    private final boolean isForUser;
    private final int ordinal;

    private static final Predicate<CharacterType> forUser = c -> c.isForUser;
    private static Predicate<CharacterType> byOrdinal(int ordinal) {
        return c -> c.ordinal == ordinal;
    }

    CharacterType(boolean isForUser, int ordinal) {
        this.isForUser = isForUser;
        this.ordinal = ordinal;
    }

    private static Stream<CharacterType> stream() {
        return Stream.of(CharacterType.values());
    }

    public static String getUserInfo(){
        StringBuilder sb = new StringBuilder();
        stream().filter(forUser).forEach(c -> sb.append(c.ordinal).append(" - ").append(c.name()).append("\n"));
        return sb.toString();
    }

    public static Optional<CharacterType> getByOrdinal(int ordinal){
        return stream().filter(byOrdinal(ordinal)).findFirst();
    }


}
