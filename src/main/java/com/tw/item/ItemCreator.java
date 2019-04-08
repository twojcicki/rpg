package com.tw.item;

import com.tw.behavior.Behavior;

import java.util.Random;

public class ItemCreator {

    public static Behavior createItem(int level) {
        int eventCount = ItemType.countEvent();
        int randInt = new Random().nextInt(eventCount);
        ItemType itemType = ItemType.getByOrdinal(randInt).orElse(ItemType.DRAGON);
        switch (itemType){
            case DRAGON:
                return new Dragon(level);
            case GHOST:
                return new Ghost(level);
            case ELIXIR:
                return new Elixir();
        }
        throw new IllegalArgumentException("Event type is not recognized.");
    }
}
