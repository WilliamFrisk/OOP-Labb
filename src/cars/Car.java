package cars;

import java.awt.*;

public abstract class Car implements Movable{
    protected final int nrDoors; //Number of doors on the car
    private final double enginePower;
    protected double currentSpeed;
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
    public void move(){
        position[0] += Math.round(Math.cos(direction) * getCurrentSpeed());
        position[1] += Math.round(Math.sin(direction) * getCurrentSpeed());
    }

    @Override
    public void turnLeft(){
        direction -= (Math.PI/180);
    }

    @Override
    public void turnRight(){
        direction += (Math.PI/180);
    }

    abstract double speedFactor();

    abstract void incrementSpeed(double amount);

    abstract void decrementSpeed(double amount);

    abstract void gas(double amount);

    abstract void brake(double amount);

}