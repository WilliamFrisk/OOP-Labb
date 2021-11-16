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
}
