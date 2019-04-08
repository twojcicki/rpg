package com.tw.behavior;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public enum BehaviorType {
    RUN(0, new Run()),
    TAKE(1, new Take()),
    FIGHT(2, new Fight()),
    GIVEUP(3, new GiveUp());

    private BehaviorEvent event;
    private int ordinal;

    private static Predicate<BehaviorType> byOrdinal(int ordinal) {
        return c -> c.ordinal == ordinal;
    }

    BehaviorType(int ordinal, BehaviorEvent event) {
        this.event = event;
        this.ordinal = ordinal;
    }

    private static Stream<BehaviorType> stream() {
        return Stream.of(BehaviorType.values());
    }

    public static String getUserInfo(){
        StringBuilder sb = new StringBuilder();
        stream().forEach(c -> sb.append(c.ordinal).append(" - ").append(c.name()).append("\n"));
        return sb.toString();
    }

    public static Optional<BehaviorType> getByOrdinal(int ordinal){
        return stream().filter(byOrdinal(ordinal)).findFirst();
    }

    public BehaviorEvent getEvent() {
        return event;
    }
}
