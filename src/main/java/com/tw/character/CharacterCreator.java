package com.tw.character;

public class CharacterCreator {
    public static Character createCharacter(CharacterType type, String name, int level) {
        switch (type) {
            case WIZARD:
                return new Wizard(name, level);
            case WARRIOR:
                return new Warrior(name, level);
        }
        throw new IllegalArgumentException("Character type is not recognized.");
    }
}
