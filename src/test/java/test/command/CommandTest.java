package test.command;

import com.tw.command.Commandable;
import com.tw.command.CommandType;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CommandTest {

    @Test
    public void commandHelp() {
        Optional<Commandable> cmd = CommandType.getCommandByKey("h");
        assertTrue(cmd.isPresent());
    }

    @Test
    public void commandWrong() {
        Optional<Commandable> cmd = CommandType.getCommandByKey("adsf");
        assertFalse(cmd.isPresent());
    }

    @Test
    public void commandNull() {
        Optional<Commandable> cmd = CommandType.getCommandByKey(null);
        assertFalse(cmd.isPresent());
    }
}
