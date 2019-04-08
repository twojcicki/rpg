package com.tw.event;

import java.util.Random;

public class EventCreator {

    public static Eventable createEvent() {
        int eventCount = EventType.countEvent();
        int randInt = new Random().nextInt(eventCount);
        EventType eventType = EventType.getByOrdinal(randInt).orElse(EventType.MONSTER_MEET);
        switch (eventType){
            case ITEM_FIND:
                return new ItemFind();
            case MONSTER_MEET:
                return new MonsterMeet();
        }
        throw new IllegalArgumentException("Event type is not recognized.");
    }
}
