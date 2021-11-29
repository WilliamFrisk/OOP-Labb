package workshops;

import vehicles.Car;

import java.util.ArrayList;

/**
 * This is a class modelling a car workshop
 *
 * @param <T> A subclass to car
 */
public class CarWorkshop<T extends Car>{

    private final ArrayList<T> storage;
    private final int capacity;

    /**
     * Constructs a car workshop
     *
     * @param capacity the max capacity of the workshop
     */
    public CarWorkshop(int capacity) {
        this.capacity = capacity;
        this.storage = new ArrayList<>();
    }

    /**
     * Returns the list of cars in the workshop
     *
     * @return the list of cars in the workshop
     */
    public ArrayList<T> getStorage() {
        return storage;
    }

    /**
     * Checks if a car is in storage
     *
     * @param car the car that is to be looked for
     * @return true if the car is in storage
     */
    public boolean isInStorage(T car) {
        return storage.contains(car);
    }

    /**
     * Adds a car to the workshop
     *
     * @param car the car to be added
     */
    public void addCar(T car) {
        if (!isFull()) {
            storage.add(car);
        } else {
            System.out.println("This workshop is full");
        }
    }

    /**
     * Gets the car at the given index
     *
     * @param index index of the car to be returned
     * @return the car at the given index
     */
    public T getCarAt(int index) {
        T removedCar = storage.get(index);
        storage.remove(index);
        return removedCar;
        // Den här implementationen är tveksam. Hur vet en bil att den är i en workshop?
        // hur vet klienten vilken bil som den ska få ut utan att kunna köra bilen som vanligt?
    }

    private boolean isFull() {
        return storage.size() == capacity;
    }
}
