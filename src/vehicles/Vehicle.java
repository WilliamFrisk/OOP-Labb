package vehicles;

import java.awt.*;

/**
 * This is an abstract superclass for vehicles
 *
 * @author William Frisk
 * @author Sandra Hawerman
 * @author Oscar Sävinger
 */

public abstract class Vehicle implements Movable {
    private final int nrDoors;
    private final double enginePower;
    private double currentSpeed;
    private Color color;
    private final String modelName;
    private double direction = 0;
    private int[] position = {0, 0};
    private final int weight;

    /**
     * Constructs the vehicle according to specification.
     *
     * @param nrDoors the number of doors that the vehicle will have
     * @param enginePower the vehicle's engine power
     * @param color the color of the vehicle
     * @param modelName the vehicle's model name
     */
    protected Vehicle(int nrDoors, double enginePower, Color color, String modelName, int weight) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
        this.weight = weight;
        stopEngine();
    }

    /**
     * Returns the weight of the vehicle
     *
     * @return the weight of the vehicle
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Returns the x-value of the vehicles position
     *
     * @return x-value of the vehicles position
     */
    public int getX() {
        return position[0];
    }

    /**
     * Returns the y-value of the vehicles position
     *
     * @return y-value of the vehicles position
     */
    public int getY() {
        return position[1];
    }

    /**
     * Returns the nr of doors on the vehicle
     *
     * @return the nr of doors on the vehicle
     */
    public int getNrDoors(){
        return nrDoors;
    }

    /**
     * Returns the model name of the vehicle
     *
     * @return model name of the vehicle
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Returns the vehicle's engine power
     *
     * @return engine power of the vehicle
     */
    public double getEnginePower() {
        return enginePower;
    }

    /**
     * Returns the vehicle's current speed
     *
     * @return the vehicle's current speed
     */
    public double getCurrentSpeed() {
        return currentSpeed;
    }

    /**
     * Returns the color of the vehicle
     *
     * @return the color of the vehicle
     */
    public Color getColor() {
        return color;
    }

    /**
     * Returns the vehicle's direction
     *
     * @return the vehicle's direction
     */
    public double getDirection() {
        return direction;
    }

    /**
     * Sets the color of the vehicle
     *
     * @param clr the color which is to be set
     */
    public void setColor(Color clr) {
        color = clr;
    }

    /**
     * Sets the current speed of the vehicle to 0
     */
    public void stopEngine() {
        currentSpeed = 0;
    }

    /**
     * Sets the current speed of the vehicle to 0.1
     */
    public void startEngine() {
        currentSpeed = 0.1;
    }

    /**
     * Updates the vehicles position depending on speed and direction
     */
    @Override
    public void move(){ // Updates the position of the car according to the speed and direction.
        position[0] += Math.round(Math.cos(direction) * getCurrentSpeed());
        position[1] += Math.round(Math.sin(direction) * getCurrentSpeed());
    }

    /**
     * Rotates the vehicle 1 degree to its left
     */
    @Override
    public void turnLeft(){ // Turns the car one degree to the left.
        direction -= (Math.PI/180);
    }

    /**
     * Rotates the vehicle 1 degree to its right
     */
    @Override
    public void turnRight(){ // Turns the car one degree to the right.
        direction += (Math.PI/180);
    }

    /**
     * Increments the speed of the vehicle according to some amount
     *
     * @param amount the amount of incrementation of the speed between 0 and 1
     * @throws IllegalArgumentException if the amount is <0 or >1
     */
    public void gas(double amount) throws IllegalArgumentException { // Calls method incrementSpeed if amount is within correct range.
        if (0 <= amount && amount <= 1) {
            incrementSpeed(amount);
        } else {
            throw new IllegalArgumentException("Argument in gas method >1 or <0");
        }
    }

    /**
     * Decrements the speed of the vehicle according to some amount
     *
     * @param amount the amount of decrementation of the speed between 0 and 1
     * @throws IllegalArgumentException if the amount is <0 or >1
     */
    public void brake(double amount) throws IllegalArgumentException { // Calls method decrementSpeed if amount is within correct range.
        if (0 <= amount && amount <= 1) {
            decrementSpeed(amount);
        } else {
            throw new IllegalArgumentException("Argument in brake method >1 or <0");
        }
    }

    /**
     * Calculates the distance from this vehicle to another
     *
     * @param other the other vehicle
     * @return the distance between the vehicles
     */
    public double distanceTo(Vehicle other) {
        double d2 = Math.pow(other.getX() - getX(), 2) + Math.pow(other.getY() - getY(), 2);
        return Math.sqrt(d2);
    }

    void setPosition(int[] pos) {
        position = pos;
    }

    private void incrementSpeed(double amount){ // Increments the speed of the car, max = enginePower
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower());
    }

    private void decrementSpeed(double amount){ // Decrements the speed of the car, min = 0
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount, 0);
    }

    abstract double speedFactor();
}