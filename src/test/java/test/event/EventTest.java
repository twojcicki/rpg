package test.event;

import com.tw.event.EventCreator;
import com.tw.event.Eventable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class EventTest {

    @Test
    public void createWizard() {
        Eventable event = EventCreator.createEvent();
        assertNotNull(event);
    }

}
