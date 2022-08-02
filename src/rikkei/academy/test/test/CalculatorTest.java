package rikkei.academy.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    @Test
    @DisplayName("Testing addition")
    void testCalculationAdd() {
        int firstOperand = 2;
        int secondOperand = 1;
        char operator = ADDITION;
        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(result, expected);
    }

    @Test
    @DisplayName("Testing subtraction")
    void testCalculationSub() {
        int firstOperand = 2;
        int secondOperand = 1;
        char operator = SUBTRACTION;
        int expected = 1;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(result, expected);
    }

    @Test
    @DisplayName("Testing multiplication")
    void testCalculationMul() {
        int firstOperand = 2;
        int secondOperand = 1;
        char operator = MULTIPLICATION;
        int expected = 1;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(result, expected);
    }

    @Test
    @DisplayName("Testing division by zero")
    void testCalculationDiv() {
        int firstOperand = 2;
        int secondOperand = 0;
        char operator = DIVISION;

        assertThrows(RuntimeException.class,
                () -> {
                    Calculator.calculate(firstOperand, secondOperand, operator);
                });
    }

    @Test
    @DisplayName("Testing wrong operator")
    void testCalculationWrongOperator() {
        int firstOperand = 2;
        int secondOperand = 0;
        char operator = '=';

        assertThrows(RuntimeException.class,
                () -> {
                    Calculator.calculate(firstOperand, secondOperand, operator);
                });
    }
}