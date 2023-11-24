import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UpgradedCalculatorTest {

    @Test
    void shouldAddOnePlusTwo() {
        int result = UpgradedCalculator.add(1,2);
        Assertions.assertEquals(3,result);
    }

    @Test
    void shouldSubtractTwoFromFour() {
        int result = UpgradedCalculator.subtract(4,2);
        Assertions.assertEquals(2,result);
    }

    @Test
    void shouldMultiplyTwoWithThree() {
        int result = UpgradedCalculator.multiply(2,3);
        Assertions.assertEquals(6,result);
    }

    @Test
    void shouldDivideFourByTwo() {
        float result = UpgradedCalculator.divide(4,2);
        Assertions.assertEquals(2,result);
    }
}