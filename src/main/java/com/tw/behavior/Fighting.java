package com.tw.behavior;

import com.tw.character.Character;

import java.text.MessageFormat;

public abstract class Fighting {
    public void fight(Character character, Character monster) {

        do {
            System.out.println("Fight!");
            double characterResult = countFactor(character);
            double monsterResult = countFactor(monster);
            System.out.println(MessageFormat.format("Fight factors: for hero {0}, for monster {1}", characterResult, monsterResult));
            character.setHealth(character.getHealth() - monsterResult);
            monster.setHealth(monster.getHealth() - characterResult);
            System.out.println(MessageFormat.format("Character health: for hero {0}, for monster {1}", character.getHealth(), monster.getHealth()));
            if (!character.isAlive()) {
                System.out.println(MessageFormat.format("Hero {0} is dead!", character.getName()));
            }
            if (!monster.isAlive()) {
                System.out.println(MessageFormat.format("Monster {0} is dead!", monster.getName()));
            }
        } while (character.isAlive() && monster.isAlive());
    }

    public abstract double countFactor(Character character);

}
