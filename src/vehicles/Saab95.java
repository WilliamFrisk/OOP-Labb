package vehicles;

import java.awt.*;

/**
 * This is a class modelling a Saab95
 *
 * @author William Frisk
 * @author Sandra Hawerman
 * @author Oscar Sävinger
 */
public class Saab95 extends Car{
    private boolean turboOn;

    /**
     * Constructs a Saab95
     */
    public Saab95(){
        super(2, 125, Color.red, "Saab95", 1300);
        turboOn = false;
    }

    /**
     * Returns true if the turbo is on
     *
     * @return the boolean value of turboOn variable
     */
    public boolean getTurboOn() {
        return turboOn;
    }

    /**
     * Sets the turbo to on
     */
    public void setTurboOn(){
	    turboOn = true;
    }

    /**
     * Sets the turbo to off
     */
    public void setTurboOff(){
	    turboOn = false;
    }

    /**
     * Returns a speedFactor according to engine power and turbo state
     *
     * @return the Saab's speedFactor
     */
    @Override
    double speedFactor(){ // Returns a speedFactor based on enginePower and whether turbo is on or off.
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }
}
