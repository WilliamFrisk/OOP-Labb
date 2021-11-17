import cars.Car;
import cars.Saab95;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    void getX_should_return_x() {
        Car testCar = new Saab95();
        assertEquals(0, testCar.getX());
    }

    @Test
    void getY_should_return_y() {
        Car testCar = new Saab95();
        assertEquals(0, testCar.getY());
    }

    @Test
    void getEnginePower_should_return_enginePower() {
        Car testCar = new Saab95();
        assertEquals(125, testCar.getEnginePower());
    }

    @Test
    void getCurrentSpeed_should_return_CurrentSpeed() {
        Car testCar = new Saab95();
        assertEquals(0, testCar.getCurrentSpeed());
    }

    @Test
    void getColor_should_return_color() {
        Car testCar = new Saab95();
        assertEquals(Color.red, testCar.getColor());
    }

    @Test
    void getDirection_should_return_direction() {
        Car testCar = new Saab95();
        assertEquals(0.0, testCar.getDirection());
    }

    @Test
    void setColor_should_set_color() {
        Car testCar = new Saab95();
        testCar.setColor(Color.yellow);
        assertEquals(Color.yellow, testCar.getColor());
    }

    @Test
    void startEngine_should_set_currentSpeed() {
        Car testCar = new Saab95();
        testCar.startEngine();
        assertEquals(0.1, testCar.getCurrentSpeed());
    }

    @Test
    void stopEngine_should_set_currentSpeed_to_zero() {
        Car testCar = new Saab95();
        testCar.startEngine();
        testCar.stopEngine();

        assertEquals(0, testCar.getCurrentSpeed());
    }

    @Test
    void move_should_change_coordinates_by_correct_amount() {
        Car testCar = new Saab95();
        testCar.move();
        assertEquals(0, testCar.getX());
        assertEquals(0, testCar.getY());
    }

    @Test
    void turnLeft_should_decrement_direction_by_correct_amount() {
        Car testCar = new Saab95();
        testCar.turnLeft();
        assertEquals(-(Math.PI/180), testCar.getDirection());
    }

    @Test
    void turnRight_should_increment_direction_by_correct_amount() {
        Car testCar = new Saab95();
        testCar.turnRight();
        assertEquals((Math.PI/180), testCar.getDirection());
    }

    @Test
    void gas_increments_speed_by_correct_amount() throws Exception {
    Saab95 testSaab = new Saab95();
    testSaab.gas(1);
    assertEquals(1.25, testSaab.getCurrentSpeed());
    }

    @Test
    void gas_cant_increase_speed_over_engine_power() throws Exception {
        Saab95 testCar = new Saab95();
        for (int i = 0; i < 150; i++) {
            testCar.gas(1);
        }
        assertEquals(testCar.getEnginePower(), testCar.getCurrentSpeed());
    }

    @Test
    void brake_decrements_speed_by_correct_amount() throws Exception {
        Saab95 testSaab = new Saab95();
        testSaab.gas(1);
        testSaab.brake(1);
        assertEquals(0, testSaab.getCurrentSpeed());
    }
    @Test
    void brake_cant_decrement_speed_under_0() throws Exception {
        Saab95 testCar = new Saab95();
        testCar.brake(1);
        assertEquals(0, testCar.getCurrentSpeed());
    }
}
