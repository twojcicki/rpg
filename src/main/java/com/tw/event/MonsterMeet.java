package com.tw.event;

public class MonsterMeet implements Eventable {
    @Override
    public String getDescription() {
        return "You meet a monster! What do you do?";
    }
}
