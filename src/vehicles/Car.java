package vehicles;

import java.awt.*;

/**
 * This is an abstract superclass for cars
 *
 * @author William Frisk
 * @author Sandra Hawerman
 * @author Oscar Sävinger
 */
public abstract class Car extends Vehicle {

    /**
     * Constructs the car according to specification.
     *
     * @param nrDoors the number of doors that the vehicle will have
     * @param enginePower the vehicle's engine power
     * @param color the color of the vehicle
     * @param modelName the vehicle's model name
     */
    protected Car (int nrDoors, double enginePower, Color color, String modelName, int weight, int startY) {
        super(nrDoors, enginePower, color, modelName, weight, startY);
    }
}