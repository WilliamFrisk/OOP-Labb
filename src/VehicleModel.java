import vehicles.Vehicle;

import java.util.List;

public class VehicleModel {

    private List<Vehicle> vehicles;
    private List<VehicleObserver> views;

    public VehicleModel() {
        // initierar listorna för vehicles och views
    }

    public void addCar(String modelName) {
        // lägger till en bil i listan.
        // titta på dokumentationen för javalistor för att lista ut hur
        // Den borde skapa en ny bil och lägga till den beroende på vilket modell namnet som är givet
        // (if-satser)
    }

    public void brakeAllVehicles(int amount) {
        // Loopa igenom alla fordon i listan och kalla på brake metoden på dem
        // kolla på implementationen i controller
    }

    public void gasAllVehicles(int amount) {
        // samma som brake fast med gas-metoden
    }

    public void turboOn() {
        // Loopa igenom fordonen i listan
        // om fordonet är en saab kalla på turboOn
        // titta på implementationen i controller
    }

    public void turboOff() {
        // samma som turboOn fast turboOff
    }

    public void startAllVehicles() {
        // Loopa igenom alla fordon och kalla på startEngine
    }

    public void stopAllVehicles() {
        // Samma som startAllvehicles men med stopEngine
    }

    public void liftAllBeds() {
        // Kolla om bilen är en Scania eller Cartransport
        // isåfall kalla på raisePlatform
    }

    public void lowerAllBeds() {
        // samma som liftAllBeds men med lowerPlatform
    }

    public void invertDirection() {
        // Akta, undvik denna
    }

    public void addView(VehicleObserver view) {
        // lägga till den givna view:n i listan med views
    }

    private void updateAll() {
        // Kalla på actOnUpdate hos alla views i listan (for-loop)
    }

    private void moveAll() {
        // Uppdatera alla fordons position i listan med fordon 20 gånger/sekund
        // titta på implementationen i controller
        // (Den här är svår)
    }
}
