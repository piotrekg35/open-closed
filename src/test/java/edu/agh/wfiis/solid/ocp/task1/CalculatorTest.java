package edu.agh.wfiis.solid.ocp.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private final Calculator underTest = new Calculator();

    @Test
    public void shouldAddValues(){
        Number result = underTest.calculate(new String[]{"1", "+", "2"});
        Assertions.assertEquals(3,result);
    }

    @Test
    public void shouldSubtractValues(){
        Number result = underTest.calculate(new String[]{"1", "-", "2"});
        Assertions.assertEquals(-1,result);
    }

    @Test
    public void shouldMultiplyValues(){
        Number result = underTest.calculate(new String[]{"1", "*", "2"});
        Assertions.assertEquals(2,result);
    }

    @Test
    public void shouldDivideValues(){
        Number result = underTest.calculate(new String[]{"2", "/", "1"});
        Assertions.assertEquals(2,result);
    }

    @Test()
    public void shouldFailWhenDividingByZero(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> underTest.calculate(new String[]{"1", "/", "0"}));
    }

    @Test()
    public void shouldFailWhenUnsupportedOperandPassed(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> underTest.calculate(new String[]{"1", "^", "2"}));
    }
}
