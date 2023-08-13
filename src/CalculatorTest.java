import static org.junit.Assert.*;

class CalculatorTest {
    String currency1="RON";
    String amountOfCurrency1="250";
    String currency2="EUR";
    Calculator calculator = new Calculator(currency1, amountOfCurrency1, currency2);
    @org.junit.jupiter.api.Test
    void calculate() {
        int expectedResult=50;
        int resultFromMethod = calculator.calculate();
        assertEquals(expectedResult, resultFromMethod);
    }
}