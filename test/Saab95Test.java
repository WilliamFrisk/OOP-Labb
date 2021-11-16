import cars.Saab95;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Saab95Test {

    @Test
    void incrementSpeed_should_increment_speed_by_correct_amount(){
        Saab95 testSaab = new Saab95();
        testSaab.incrementSpeed(1);
        assertEquals(1.25, testSaab.getCurrentSpeed());
    }

    @Test
    void decrementSpeed_should_decrement_speed_by_correct_amount() {
        Saab95 testSaab = new Saab95();
        testSaab.incrementSpeed(1);
        testSaab.decrementSpeed(1);
        assertEquals(0, testSaab.getCurrentSpeed());
    }

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
    void gas_increments_speed_by_correct_amount() {

    }

    @Test
    void break_decrements_speed_by_correct_amount() {

    }


}
