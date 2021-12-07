package workshops;

import vehicles.Car;

import dataTypes.CarStorage;

/**
 * This is a class modelling a car workshop
 *
 * @param <T> A subclass to car
 */
public class CarWorkshop<T extends Car>{

    private final CarStorage<T> storage;

    /**
     * Constructs a car workshop
     *
     * @param capacity the max capacity of the workshop
     */
    public CarWorkshop(int capacity) {
        this.storage = new CarStorage<>(capacity);
    }

    /**
     * Checks if a car is in storage
     *
     * @param car the car that is to be looked for
     * @return true if the car is in storage
     */
    public boolean isInStorage(T car) {
        return storage.isInStorage(car);
    }

    /**
     * Adds a car to the workshop
     *
     * @param car the car to be added
     */
    public void addCar(T car) {
        storage.addCar(car);
    }

    /**
     * Returns the given car from storage
     *
     * @param car the car to be returned
     * @return the car at the given index
     */
    public T getCar(T car) {
        return storage.get(car);
        // Den här implementationen är tveksam. Hur vet en bil att den är i en workshop?
        // hur vet klienten vilken bil som den ska få ut utan att kunna köra bilen som vanligt?
    }
}
