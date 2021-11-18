

import cars.*;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        Saab95 saab = new Saab95();
        Volvo240 volvo = new Volvo240();

//        for (int j = 0; j < 10; j++) {
//            System.out.println("x > " + saab.getX());
//            System.out.println("y > " + saab.getY());
//            saab.move();
//            for (int i = 0; i < 90; i++) {
//                saab.turnLeft();
//            }
//        }

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
