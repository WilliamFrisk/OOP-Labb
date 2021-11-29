import org.junit.jupiter.api.Test;
import vehicles.Scania;
import vehicles.Truck;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScaniaTest {

    @Test
    void getPlatformAngle_should_return_platform_angle() {
        Scania testTruck = new Scania();
        assertEquals(0, testTruck.getPlatformAngle());
    }

    @Test
    void raisePlatform_should_increment_platform_angle() {
        Scania testTruck = new Scania();
        for (int i = 0; i < 3; i++) {
            testTruck.raisePlatform();
        }
        assertEquals(3, testTruck.getPlatformAngle());
    }

    @Test
    void lowerPlatform_should_decrement_platform_angle() {
        Scania testTruck = new Scania();
        for (int i = 0; i < 3; i++) {
            testTruck.raisePlatform();
        }
        for (int i = 0; i < 3; i++) {
            testTruck.lowerPlatform();
        }
        assertEquals(0, testTruck.getPlatformAngle());
    }

    @Test
    void move_should_not_update_position_if_platform_is_down() {
        Scania testTruck = new Scania();
        for (int i = 0; i < 3; i++) {
            testTruck.raisePlatform();
        }
        testTruck.startEngine();
        testTruck.gas(1);
        testTruck.move();
        assertEquals(0, testTruck.getX());
    }
}
