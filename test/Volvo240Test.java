
import org.junit.jupiter.api.Test;
import vehicles.Volvo240;
import static org.junit.jupiter.api.Assertions.*;

public class Volvo240Test {

    @Test
    void speedFactor_should_return_correct_value(){
        Volvo240 testVolvo = new Volvo240();
        assertEquals(1.25, testVolvo.speedFactor());
    }
}



