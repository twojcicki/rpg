package test.ui;

import com.tw.command.Commandable;
import com.tw.ui.MenuItem;
import org.junit.Before;
import org.junit.Test;

public class MenuTest {
    private MenuItem<Commandable> menu;

    @Before
    public void setup() {
        menu = new MenuItem<>(null);
        //MenuItem<Commandable> node1 = menu.addChild(new MenuItem<>(new NewGameCmd()));
        //MenuItem<Commandable> node2 = menu.addChild(new MenuItem<>(new SaveGameCmd()));
        //MenuItem<Commandable> node3 = menu.addChild(new MenuItem<>(new SaveGameCmd()));

        /*MenuItem<String> node11 = node1.addChild(new MenuItem<String>("node 11"));
        MenuItem<String> node111 = node11.addChild(new MenuItem<String>("node 111"));
        MenuItem<String> node112 = node11.addChild(new MenuItem<String>("node 112"));

        MenuItem<String> node12 = node1.addChild(new MenuItem<String>("node 12"));

        MenuItem<String> node2 = menu.addChild(new MenuItem<String>("node 2"));

        MenuItem<String> node21 = node2.addChild(new MenuItem<String>("node 21"));
        MenuItem<String> node211 = node2.addChild(new MenuItem<String>("node 22"));*/
    }

}
