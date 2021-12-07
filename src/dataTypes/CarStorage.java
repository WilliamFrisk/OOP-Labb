package dataTypes;

import vehicles.Car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 This is a class for representing a collection of cars
 */

public class CarStorage<T extends Car> implements Iterable<T> {

    private final ArrayList<T> storage;
    private final int capacity;

    public CarStorage(int capacity) {
        this.storage = new ArrayList<>();
        this.capacity = capacity;
    }

    public void addCar(T car) {
        if (!isFull()) {
            storage.add(car);
        } else {
            System.out.println("Storage is full");
        }
    }

    public T pop() {
        return storage.remove(storage.size() - 1);
    }

    public boolean isInStorage(T car) {
        return storage.contains(car);
    }

    public T get(T car) {
        T returnedCar = storage.get(storage.indexOf(car));
        storage.remove(car);

        return returnedCar;
    }

    private boolean isFull() {
        return storage.size() >= capacity;
    }

    @Override
    public Iterator<T> iterator() {
        return this.storage.iterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}
