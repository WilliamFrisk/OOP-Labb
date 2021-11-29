import vehicles.*;
import workshops.CarWorkshop;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        Saab95 saab = new Saab95();
        Volvo240 volvo = new Volvo240();

        CarWorkshop<Car> testCarWorkshop = new CarWorkshop<>(3);
        testCarWorkshop.addCar(saab);

        for(int i = 0; i < 90; i++) {
            volvo.gas(1);
            System.out.println(volvo.getCurrentSpeed());
        }

        volvo.getX();

        Car[] carArray = {volvo, saab};

        for (Car car : carArray) {
            car.gas(0);
        }


    }
}
