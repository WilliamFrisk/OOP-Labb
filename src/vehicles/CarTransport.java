package vehicles;

import dataTypes.CarStorage;

import java.awt.*;

/**
 * This is a class modelling a car transport truck
 *
 * @author William Frisk
 * @author Sandra Hawerman
 * @author Oscar Sävinger
 */
public class CarTransport extends Truck {
    private final CarStorage<Car> load;
    private boolean isLowered;

    /**
     * Constructs a CarTransport
     */
    public CarTransport(int capacity, int startY) {
        super(2, 200, Color.BLACK, "CarTransport", 8500, startY);
        this.load = new CarStorage<>(capacity);
        this.isLowered = false;
    }

    /**
     * Returns the load on the CarTransport
     *
     * @return a stack consisting of the cars on the CarTransport
     */
    public CarStorage<Car> getLoad() {
        return load;
    }

    /**
     * Returns true if the platform is lowered
     *
     * @return true if the platform is lowered
     */
    public boolean getIsLowered() {
        return isLowered;
    }

    /**
     * Sets the platform to raised
     */
    public void raisePlatform() {
        isLowered = false;
    }

    /**
     * Sets the platform to lowered if the transport is stationary
     */
    public void lowerPlatform() {
        if (getCurrentSpeed() == 0) {
            isLowered = true;
        } else {
            System.out.println("You need to be stationary to lower the platform");
        }
    }

    /**
     * Loads a car on the CarTransport
     * The car to be loaded needs to be within 10 units of distance
     *
     * @param car the car to be loaded
     */
    public void loadCar(Car car) {
        if (distanceTo(car) < 10 && isLowered) {
            load.addCar(car);
        } else {
            // This should probably be implemented using a visual or audible cue in the future
            System.out.println("The car to be loaded needs to be closer or the platform isn't lowered");
        }
    }

    /**
     * Unloads a car behind the CarTransport
     */
    public void unloadCar() {
        if (isLowered) {
            int[] unloadCoords = new int[]{(int) Math.round(Math.cos(getDirection() + Math.PI)),
                    (int) Math.round(Math.sin(getDirection() + Math.PI))};
            Car unloadedCar = load.pop();

            unloadedCar.setPosition(unloadCoords);
        } else {
            System.out.println("Platform needs to be lowered to unload a car");
        }
    }

    /**
     * Moves the CarTransport and its load
     */
    @Override
    public void move() {
        if (!isLowered) {
            super.move();
            updateLoadPosition();
        } else {
            System.out.println("Raise platform before driving");
        }
    }

    double speedFactor() {
        return getEnginePower() * 0.01 - getLoadWeight() * 0.001;
    }

    private void updateLoadPosition() {
        // More precise position updating of the loads position might be necessary
        // in the future but is hard to implement without being able to run the
        // actual application
        for (Car car: load) {
            car.setPosition(new int[] {getX(), getY()});
        }
    }

    private int getLoadWeight() {
        int loadWeight = 0;
        for (Car car : load) {
            loadWeight += car.getWeight();
        }
        return loadWeight;
    }
}
