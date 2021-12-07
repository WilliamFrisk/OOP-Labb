import vehicles.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */

public class CarController {
    // member fields:

    // The delay (ms) corresponds to 20 updates a sec (hz)
    private final int delay = 50;
    // The timer is started with an listener (see below) that executes the statements
    // each step between delays.
    private Timer timer = new Timer(delay, new TimerListener());

    // The frame that represents this instance View of the MVC pattern
    CarView frame;
    // A list of cars, modify if needed
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    //methods:

    public static void main(String[] args) {
        // Instance of this class
        CarController cc = new CarController();

        cc.vehicles.add(new Volvo240(0));
        cc.vehicles.add(new Saab95(100));
        cc.vehicles.add(new Scania(200));

        // Start a new view and send a reference of self
        cc.frame = new CarView("CarSim 1.0", cc);

        // Start the timer
        cc.timer.start();
    }

    /* Each step the TimerListener moves all the cars in the list and tells the
    * view to update its images. Change this method to your needs.
    * */
    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (Vehicle vehicle : vehicles) {
                int x = vehicle.getX();
                int y = vehicle.getY();
                if (frame.getWidth() < x + frame.drawPanel.volvoImage.getWidth()) {
                    invertDirection(vehicle);
                    vehicle.setX(frame.getWidth() - frame.drawPanel.volvoImage.getWidth());
                } else if (x < 0) {
                    invertDirection(vehicle);
                    vehicle.setX(0);
                }

                vehicle.move();

                x = vehicle.getX();
                y = vehicle.getY();

                frame.drawPanel.moveit(x, y, vehicle);
                // repaint() calls the paintComponent method of the panel
                frame.drawPanel.repaint();
            }
        }
    }

    // Calls the gas method for each car once
    void gas(int amount) {
        double gas = ((double) amount) / 100;
        for (Vehicle car : vehicles) {
            car.gas(gas);
        }
    }

    // Calls the brake method for each car once
    void brake(int amount) {
        double brake = ((double) amount) / 100;
        for (Vehicle car : vehicles) {
            car.brake(brake);
        }
    }

    void invertDirection(Vehicle car) {
        for (int i = 0; i < 180; i++) {
            car.turnLeft();
        }
    }

    // Implementera ett interface för detta så att koden beror på abstraktionen istället för implementationen
    // då kan koden följa OCP
    void turboOn() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Saab95) {
                ((Saab95) vehicle).setTurboOn();
            }
        }
    }

    void turboOff() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Saab95) {
                ((Saab95) vehicle).setTurboOff();
            }
        }
    }

    void start() {
        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
        }
    }

    void stop() {
        for (Vehicle vehicle : vehicles) {
            vehicle.stopEngine();
        }
    }

    void liftBed() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Scania) {
                ((Scania) vehicle).raisePlatform();
            }
        }
    }

    void lowerBed() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Scania) {
                ((Scania) vehicle).lowerPlatform();
            }
        }
    }
}
