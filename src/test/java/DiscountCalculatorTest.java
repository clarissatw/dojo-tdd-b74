import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiscountCalculatorTest {

    @Test
    public void shouldReturnOkWhenApplicationIsReady() {
        String expected = "Ok";

        DiscountCalculator discountCalculator = new DiscountCalculator();
        String actual = discountCalculator.healthCheck();

        assertEquals(expected, actual);
    }
}