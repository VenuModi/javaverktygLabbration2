package KataStringCalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;
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
    void checkIfStringOfTwoNumbersReturnsSum(){

        assertEquals(3, StringCalculator.add("1,2"));
    }

    @Test
    @DisplayName("Step-2 : Test-1")
    void checkIfAdditionOfMultipleNumbersReturnsSum(){
        assertEquals(10, StringCalculator.add("5,2,3"));
    }

    @Test
    @DisplayName("Step-3 : Test-1")
    void checkIfAddMethodHandlesNewLinesBetweenNumbers(){
        assertEquals(6,StringCalculator.add("1\n2,3"));
    }

    @Test
    @DisplayName("Step-4 : Test-1")
    void checkIfAdditionSupportsDifferentDelimeters(){
        assertEquals(3, StringCalculator.add("//;\n1;2"));
    }

    @Test
    @DisplayName("Step-5 : Test - 1")
    void checkIfPassingANegativeNumberThrowsAnException(){
        assertThatThrownBy(() -> StringCalculator.add("-1,-3,-4,2")).
                hasMessageContaining("Negatives not allowed: [-1, -3, -4]");
    }

    @Test
    @DisplayName("Step-6 : Test-1")
    void checkIfNumbersBiggerThanThousandAreIgnored(){
        assertEquals(2, StringCalculator.add("2,1005"));
    }

    @Test
    @DisplayName("Step-7 : Test-1")
    void checkDelimetersOfAnyLengthReturnsSix(){
        assertEquals(6, StringCalculator.add("//[***]\n1***2***3"));
    }
}
