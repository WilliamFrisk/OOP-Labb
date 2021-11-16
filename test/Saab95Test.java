import cars.Saab95;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Saab95Test {

    @Test
    void startEngine_should_set_currentSpeed() {
        Saab95 testSaab = new Saab95();
        testSaab.startEngine();
        assertEquals(0.1, testSaab.getCurrentSpeed());
    }
}
