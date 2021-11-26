package vehicles;

import java.awt.*;

public abstract class Truck extends Vehicle {
    public Truck (int nrDoors, double enginePower, Color color, String modelName){
        super(nrDoors, enginePower, color, modelName);
    }

    private int platformAngle;
    private double weight;

    public int getAnglePlatform() {
        return platformAngle;
    }

    // Metod för att tippa flaket
    private void raisePlatform() {
        if (platformAngle == 70) {
            System.out.println("Platform at highest point");
        } else {
            platformAngle ++;
        }
    }

    // Metod för att sänka tillbaka flaket
    private void lowerPlatform() {
        if (platformAngle == 0) {
            System.out.println("Platform at lowest point");
        } else {
            platformAngle --;
        }
    }

// Ska det vara hålla inne och sänka eller ska den sänkas till 0 direkt?
// Samma sak på höjningen, olika nivåer eller hålla inne till ev maxhöjd?
}
