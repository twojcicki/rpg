package com.tw.storage;

import com.tw.character.Character;

import java.util.Optional;

public interface Storage {

    void save(Character hero);
    Optional<Character> load();
}
