package vehicles;

import java.awt.*;

/**
 * This is an abstract superclass for trucks
 *
 * @author William Frisk
 * @author Sandra Hawerman
 * @author Oscar Sävinger
 */
public abstract class Truck extends Vehicle{
    /**
     * Constructs the truck according to specification.
     * Not intended to be used in the client code.
     *
     * @param nrDoors the number of doors that the vehicle will have
     * @param enginePower the vehicle's engine power
     * @param color the color of the vehicle
     * @param modelName the vehicle's model name
     */
    protected Truck (int nrDoors, double enginePower, Color color, String modelName, int weight){
        super(nrDoors, enginePower, color, modelName, weight);
    }
}
