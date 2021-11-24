import cars.Saab95;
import cars.Volvo240;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Saab95Test {

    @Test
    void setTurboOn_sets_turboOn_to_true() {
        Saab95 testSaab = new Saab95();
        testSaab.setTurboOn();
        assertTrue(testSaab.getTurboOn());
    }

    @Test
    void setTurboOff_sets_turboOn_to_false() {
        Saab95 testSaab = new Saab95();
        testSaab.setTurboOff();
        assertFalse(testSaab.getTurboOn());
    }

    @Test
    void speedFactor_should_return_correct_value(){
        Saab95 testSaab = new Saab95();
        assertEquals(1.25, testSaab.speedFactor());
    }
}
