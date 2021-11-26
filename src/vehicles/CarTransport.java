package vehicles;

import vehicles.Car;
import vehicles.Truck;

import java.awt.*;
import java.util.Stack;

public class CarTransport extends Truck {
    private Stack<Car> load = new Stack<>();

    public CarTransport() {
        super(2, 200, Color.BLACK, "CarTransport");
    }

    // This should maybe be implemented in the superclass using parametric polymorphism?
    public Stack<Car> getLoad() {
        return load;
    }

    public void loadCar(Car car) {
        if (distanceTo(car) < 10) {
            load.push(car);
        } else {
            // This should probably be implemented using a visual or audible cue in the future
            System.out.println("The car to be loaded needs to be closer");
        }
    }

    public void unloadCar() {
        int[] unloadCoords = new int[] {(int) Math.round(Math.cos(getDirection() + Math.PI)),
                (int) Math.round(Math.sin(getDirection() + Math.PI))};
        Car unloadedCar = load.pop();

        unloadedCar.setPosition(unloadCoords);
    }

    @Override
    public void move() {
        super.move();
        updateLoadPosition();
    }

    // TODO override the tipping method to satisfy lab pm

    private void updateLoadPosition() {
        // More precise position updating of the loads position might be necessary
        // in the future but is hard to implement without being able to run the
        // actual application
        for (Car car: load) {
            car.setPosition(new int[] {getX(), getY()});
        }
    }

    public double speedFactor() {
        return 0.0;
    }
}
