package cars;

import java.awt.*;

public class Volvo240 extends Car {

    private final static double trimFactor = 1.25;

    public Volvo240(){
        super(4, 100, Color.black, "Volvo240");
    }
    
    public int getNrDoors(){
        return nrDoors;
    }

    public double speedFactor(){  // Returns a speedFactor based on enginePower and trimFactor
        return getEnginePower() * 0.01 * trimFactor;
    }
}
