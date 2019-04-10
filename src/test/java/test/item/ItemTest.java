package test.item;

import com.tw.item.Behavior;
import com.tw.item.ItemCreator;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ItemTest {

    @Test
    public void createDragon() {
        Behavior item = ItemCreator.createItem(3);
        assertNotNull(item);
    }

}
