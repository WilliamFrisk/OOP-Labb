import org.junit.jupiter.api.Test;
import vehicles.Car;
import vehicles.CarTransport;
import vehicles.Truck;

import static org.junit.jupiter.api.Assertions.*;

public class CarTransportTest {


    @Test
    void raisePlatform_should_raise_platform() {
        CarTransport testCarTransport = new CarTransport(1);
        testCarTransport.raisePlatform();
        assertFalse(testCarTransport.getIsLowered());
    }

    @Test
    void lowerPlatform_should_lower_platform() {
        CarTransport testCarTransport = new CarTransport(1);
        testCarTransport.lowerPlatform();
        assertTrue(testCarTransport.getIsLowered());
    }

    @Test
    void move_should_update_CarTransport_position() {
        CarTransport testCarTransport = new CarTransport(1);
        testCarTransport.startEngine();
        testCarTransport.gas(1);
        testCarTransport.move();

        assertNotEquals(0, testCarTransport.getX());
    }
}