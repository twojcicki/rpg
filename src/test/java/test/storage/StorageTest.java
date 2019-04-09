package test.storage;

import com.tw.character.CharacterCreator;
import com.tw.character.CharacterType;
import com.tw.context.GameContext;
import com.tw.gamerule.GameRule;
import com.tw.gamerule.LevelGain;
import com.tw.character.Character;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StorageTest {
    private GameContext gameContext;

    @Before
    public void before(){
        gameContext = GameContext.getInstance();
        Character hero = CharacterCreator.createCharacter(CharacterType.WARRIOR, "Test", 2);
        GameRule gameRule = new LevelGain();
        gameContext.setHero(hero);
        gameContext.setGameRule(gameRule);
    }

    @Test
    public void saveLoad(){
        Character hero1 = gameContext.getHero();
        gameContext.saveGame();
        gameContext.setHero(CharacterCreator.createCharacter(CharacterType.WIZARD, "Test22", 1));
        gameContext.loadGame();
        Character hero2 = gameContext.getHero();
        assertEquals(hero2.getLevel(), hero1.getLevel());
        assertEquals(hero2.getName(),hero1.getName());
    }
}
