package test.ui;

import com.tw.command.Commandable;
import com.tw.context.GameContext;
import com.tw.ui.Menu;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class MenuTest {
    private Menu menu;

    @Before
    public void setup() {
        menu = new Menu(GameContext.getInstance());
    }

    @Test
    public void getMenuInfo(){
        assertNotNull(menu.getMenuInfo());
    }

    @Test
    public void getCurrentCommand(){
        Optional<Commandable> loadGame = menu.getCurrentCommand(1);
        assertTrue(loadGame.isPresent());

    }

}
