package KataStringCalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    @Test
    @DisplayName("Step-1 : Test-1")
    void checkIfEmptyStringReturnsEmpty(){
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    @DisplayName("Step-1 : Test-2")
    void checkIfTheSumOfASingleNumberIsTheSameNumber(){
        assertEquals(1, StringCalculator.add("1"));
    }

    @Test
    @DisplayName("Step-1 : Test-3")
    void checkIfStringOfNumbersReturnsSum(){

        assertEquals(3, StringCalculator.add("1,2"));
    }
}
