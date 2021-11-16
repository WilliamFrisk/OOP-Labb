import cars.Car;
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

    @Test
    void getX_should_return_x() {
        Saab95 testSaab = new Saab95();
        assertEquals(0, testSaab.getX());
    }

    @Test
    void getY_should_return_y() {
        Saab95 testSaab = new Saab95();
        assertEquals(0, testSaab.getY());
    }
}
