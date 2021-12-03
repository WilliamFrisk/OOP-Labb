package vehicles;

import java.awt.*;

/**
 * This is a class modelling a Volvo240
 *
 * @author William Frisk
 * @author Sandra Hawerman
 * @author Oscar Sävinger
 */
public class Volvo240 extends Car {

    private final static double trimFactor = 1.25;

    /**
     * Constructs a Volvo240
     */
    public Volvo240(){
        super(4, 100, Color.black, "Volvo240", 1400);
    }

    /**
     * Returns a speedFactor according to engine power and trim factor
     *
     * @return the Volvo's speedFactor
     */
    @Override
    double speedFactor() {  // Returns a speedFactor based on enginePower and trimFactor
        return getEnginePower() * 0.01 * trimFactor;
    }
}
