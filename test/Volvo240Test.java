
import org.junit.jupiter.api.Test;
import cars.Volvo240;
import static org.junit.jupiter.api.Assertions.*;

public class Volvo240Test {

    @Test
    void incrementSpeed_should_increment_speed_by_correct_amount() {
        Volvo240 testVolvo = new Volvo240();
        testVolvo.incrementSpeed(1);
        assertEquals(1.25, testVolvo.getCurrentSpeed());
    }
    @Test
    void decrementSpeed_should_decrement_speed_by_correct_amount(){
        Volvo240 testVolvo = new Volvo240();
        testVolvo.incrementSpeed(1);
        testVolvo.decrementSpeed(1);
        assertEquals(0, testVolvo.getCurrentSpeed());
    }
    @Test
    void getNrDoors_should_return_numbers_of_doors(){
        Volvo240 testVolvo = new Volvo240();
        assertEquals(4, testVolvo.getNrDoors());
    }
    @Test
    void speedFactor_should_return_correct_value(){
        Volvo240 testVolvo = new Volvo240();
        assertEquals(1.25, testVolvo.speedFactor());
    }
}



