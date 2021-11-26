package vehicles.trucks;

import java.awt.*;

public class Scania extends Truck {

    public Scania() {
        super(2, 200, Color.white, "Scania");
    }

    @Override
    double speedFactor() {
        return 0;
    }
}
