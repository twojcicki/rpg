package com.tw.character;

import com.tw.item.Dragon;
import com.tw.item.Ghost;

public class CharacterCreator {
    public static Character createCharacter(CharacterType type, String name, int level) {
        switch (type) {
            case WIZARD:
                return new Wizard(name, level);
            case WARRIOR:
                return new Warrior(name, level);
            case GHOST:
                return new Ghost(level);
            case DRAGON:
                return new Dragon(level);
        }
        throw new IllegalArgumentException("Character type is not recognized.");
    }
}
