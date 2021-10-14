import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    @DisplayName("This test worked Successfully!")

    void checkingMethod(){
        Factorial f = new Factorial();
        int [] demo = new int[] {5,5,5,5};
        for (int value : demo){
            Assertions.assertEquals(f.FactorialOfNumber(value),120);
        }
    }
    @Test
    @DisplayName("Another test passed")
    void another(){
        Factorial f = new Factorial();
        int [] another = new int[] {5,5,5,5};
        for (int b: another){
            Assertions.assertEquals(f.FactorialOfNumber(b),120);
        }
    }
}