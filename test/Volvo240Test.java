
import org.junit.jupiter.api.Test;
import cars.Volvo240;
import static org.junit.jupiter.api.Assertions.*;

public class Volvo240Test {

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



