package cars;

import java.awt.*;

public abstract class Car implements Movable {
    private final int nrDoors; // Number of doors on the car
    private final double enginePower;
    private double currentSpeed;
    private Color color;
    private final String modelName;
    private double direction = 0;
    private int[] position = {0, 0};

    public Car(int nrDoors, double enginePower, Color color, String modelName) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
        stopEngine();
    }

    public int getX() {
        return position[0];
    }

    public int getY() {
        return position[1];
    }

    public int getNrDoors(){
        return nrDoors;
    }

    public String getModelName() {
        return modelName;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public Color getColor() {
        return color;
    }

    public double getDirection() {
        return direction;
    }

    public void setColor(Color clr) {
        color = clr;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    @Override
    public void move(){ // Updates the position of the car according to the speed and direction.
        position[0] += Math.round(Math.cos(direction) * getCurrentSpeed());
        position[1] += Math.round(Math.sin(direction) * getCurrentSpeed());
    }

    @Override
    public void turnLeft(){ // Turns the car one degree to the left.
        direction -= (Math.PI/180);
    }

    @Override
    public void turnRight(){ // Turns the car one degree to the right.
        direction += (Math.PI/180);
    }

    public void gas(double amount) throws IllegalArgumentException { // Calls method incrementSpeed if amount is within correct range.
        if (0 <= amount && amount <= 1) {
            incrementSpeed(amount);
        } else {
            throw new IllegalArgumentException("Invalid input to gas method");
        }
    }

    public void brake(double amount) throws IllegalArgumentException { // Calls method decrementSpeed if amount is within correct range.
        if (0 <= amount && amount <= 1) {
            decrementSpeed(amount);
        } else {
            throw new IllegalArgumentException("Invalid input to break method");
        }
    }

    private void incrementSpeed(double amount){ // Increments the speed of the car, max = enginePower
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower());
    }

    private void decrementSpeed(double amount){ // Decrements the speed of the car, min = 0
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount, 0);
    }

    abstract double speedFactor();
}