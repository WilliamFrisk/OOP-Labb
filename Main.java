import cars.*;

public class Main {
    public static void main(String[] args) {
        Saab95 saab = new Saab95();

        for (int j = 0; j < 10; j++) {
            System.out.println("x > " + saab.getX());
            System.out.println("y > " + saab.getY());
            saab.move();
            for (int i = 0; i < 90; i++) {
                saab.turnLeft();
            }
        }
    }
}
