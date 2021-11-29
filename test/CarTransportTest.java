import org.junit.jupiter.api.Test;
import vehicles.Car;
import vehicles.CarTransport;
import vehicles.Truck;

import static org.junit.jupiter.api.Assertions.*;

public class CarTransportTest {


    @Test
    void raisePlatform_should_raise_platform() {
        CarTransport testCarTransport = new CarTransport();
        testCarTransport.raisePlatform();
        assertFalse(testCarTransport.getIsLowered());
    }

    @Test
    void lowerPlatform_should_lower_platform() {
        CarTransport testCarTransport = new CarTransport();
        testCarTransport.lowerPlatform();
        assertTrue(testCarTransport.getIsLowered());
    }
}