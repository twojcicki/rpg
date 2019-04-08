package test.storage;

import com.tw.character.CharacterCreator;
import com.tw.character.CharacterType;
import com.tw.storage.FileStorage;
import com.tw.storage.Storage;
import com.tw.character.Character;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StorageTest {
    private Storage storage;

    @Before
    public void before(){
        storage = new FileStorage();
    }

    @Test
    public void saveLoad(){
        Character hero1 = CharacterCreator.createCharacter(CharacterType.WARRIOR, "Test", 2);
        storage.save(hero1);
        Optional<Character> hero2 = storage.load();
        assertTrue(hero2.isPresent());
        assertEquals(hero2.get().getLevel(), hero1.getLevel());
        assertTrue(hero2.get().getName().equals(hero1.getName()));
    }
}
