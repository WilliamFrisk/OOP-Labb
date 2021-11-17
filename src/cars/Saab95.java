package cars;

import java.awt.*;

public class Saab95 extends Car{
    private boolean turboOn;

    public Saab95(){
        super(2, 125, Color.red, "Saab95");
        turboOn = false;
    }

    public boolean getTurboOn() {
        return turboOn;
    }

    public void setTurboOn(){
	    turboOn = true;
    }

    public void setTurboOff(){
	    turboOn = false;
    }
    
    public double speedFactor(){ // Returns a speedFactor based on enginePower and whether turbo is on or off.
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }
}
