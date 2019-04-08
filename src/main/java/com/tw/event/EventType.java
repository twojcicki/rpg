package com.tw.event;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public enum EventType {
    MONSTER_MEET(0),
    ITEM_FIND(1);

    private int ordinal;

    private EventType(int ordinal) {
        this.ordinal = ordinal;
    }

    private static Predicate<EventType> byOrdinal(int ordinal) {
        return c -> c.ordinal == ordinal;
    }
    private static Stream<EventType> stream() {
        return Stream.of(EventType.values());
    }

    public static int countEvent(){
        return (int)stream().count();
    }

    public static Optional<EventType> getByOrdinal(int ordinal){
        return stream().filter(byOrdinal(ordinal)).findFirst();
    }
}
