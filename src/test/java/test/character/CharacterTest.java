package test.character;

import com.tw.character.Character;
import com.tw.character.CharacterCreator;
import com.tw.character.CharacterType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharacterTest {

    @Test
    public void createWizard() {
        Character character = CharacterCreator.createCharacter(CharacterType.WIZARD, "TestNameWizard", 1);
        assertEquals("TestNameWizard", character.getName());
    }

    @Test
    public void createWarrior() {
        Character character = CharacterCreator.createCharacter(CharacterType.WIZARD, "TestNameWarrior", 1);
        assertEquals("TestNameWarrior", character.getName());
    }
}
