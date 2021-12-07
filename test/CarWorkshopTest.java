import org.junit.jupiter.api.Test;
import vehicles.Car;
import vehicles.Saab95;
import workshops.CarWorkshop;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarWorkshopTest {

//    @Test
//    void addCar_should_add_car_to_storage() {
//        CarWorkshop<Car> testWorkshop = new CarWorkshop<>(1);
//        Car testCar = new Saab95();
//
//        testWorkshop.addCar(testCar);
//
//        ArrayList<Car> expected = new ArrayList<>();
//        expected.add(testCar);
//
//        assertEquals(expected, testWorkshop.getStorage());
//    }

    @Test
    void isInStorage_should_return_true_if_the_car_is_in_storage() {
        CarWorkshop<Car> testWorkshop = new CarWorkshop<>(1);
        Car testCar = new Saab95(0);

        testWorkshop.addCar(testCar);

        assertTrue(testWorkshop.isInStorage(testCar));
    }

//    @Test
//    void getCarAt_should_return_correct_car() {
//        CarWorkshop<Car> testWorkshop = new CarWorkshop<>(1);
//        Car testCar = new Saab95();
//
//        testWorkshop.addCar(testCar);
//
//        assertEquals(testCar, testWorkshop.getCarAt(0));
//    }
}
