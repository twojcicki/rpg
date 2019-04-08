package com.tw.item;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public enum ItemType {
    DRAGON(0),
    GHOST(1),
    ELIXIR(2);

    private int ordinal;

    private static Predicate<ItemType> byOrdinal(int ordinal) {
        return c -> c.ordinal == ordinal;
    }

    private ItemType(int ordinal) {
        this.ordinal = ordinal;
    }

    private static Stream<ItemType> stream() {
        return Stream.of(ItemType.values());
    }

    public static Optional<ItemType> getByOrdinal(int ordinal){
        return stream().filter(byOrdinal(ordinal)).findFirst();
    }

    public static int countEvent(){
        return (int)stream().count();
    }
}
