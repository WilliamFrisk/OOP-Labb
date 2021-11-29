package vehicles;

import java.awt.*;

/**
 * This is a class modelling a Scania truck
 *
 * @author William Frisk
 * @author Sandra Hawerman
 * @author Oscar Sävinger
 */
public class Scania extends Truck {
    private int loadWeight;
    private final int maxLoad;
    private int platformAngle;

    /**
     * Constructs a Scania truck
     */
    public Scania() {
        super(2, 200, Color.white, "Scania", 9000);
        maxLoad = 7000;
    }

    /**
     * Returns the angle of the platform
     *
     * @return the angle of the platform
     */
    public int getPlatformAngle() {
        return platformAngle;
    }

    /**
     * Lowers the platform one degree
     * Lowest angle is 0 degrees
     */
    public void lowerPlatform() {
        if (platformAngle == 0) {
            System.out.println("Platform at lowest point");
        } else {
            platformAngle--;
        }
    }

    /**
     * Raises the platform one degree
     * Highest angle is 70 degrees
     */
    public void raisePlatform() {
        if (platformAngle == 70) {
            System.out.println("Platform at highest point");
        } else {
            platformAngle++;
        }
    }

    /**
     * Moves the Scania truck if the platform is lowered
     */
    @Override
    public void move() {
        if (canMove()) {
            super.move();
        } else {
            System.out.println("Lower platform before driving");
        }
    }

    /**
     * Returns the speedFactor of the Scania truck according to weight of its load
     *
     * @return the speedFactor of the Scania truck
     */
    @Override
    double speedFactor() {
        return getCurrentSpeed() * 44.995 - getWeight();
    }

    /**
     * Returns true if the angle of platform is over zero
     * @return the boolean value of canMove method
     */
    private boolean canMove() {
        return getPlatformAngle() == 0;
    }
}