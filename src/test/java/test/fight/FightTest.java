package test.fight;

import com.tw.character.Character;
import com.tw.character.CharacterCreator;
import com.tw.character.CharacterType;
import com.tw.behavior.FightContext;
import org.junit.Before;
import org.junit.Test;

public class FightTest {
    private Character hero;
    private Character monster;
    private FightContext fightContext;

    @Before
    public void setup() {
        this.fightContext = new FightContext();
    }

    @Test
    public void magicFight() {
        this.hero = CharacterCreator.createCharacter(CharacterType.WIZARD, "TestWizart", 1);
        this.monster = CharacterCreator.createCharacter(CharacterType.GHOST, "", 1);
        //fightContext.setFighting(new MagicFight());
        //fightContext.fight(hero, monster);
    }

    @Test
    public void swordFight() {
        this.hero = CharacterCreator.createCharacter(CharacterType.WIZARD, "TestWizart", 1);
        this.monster = CharacterCreator.createCharacter(CharacterType.DRAGON, "", 1);
        //fightContext.setFighting(new SwordFight());
        //fightContext.fight(hero, monster);
    }

}
