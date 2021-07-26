import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiscountCalculatorTest {

    private DiscountCalculator discountCalculator;

    @BeforeEach
    public void setup(){
        discountCalculator = new DiscountCalculator();
    }

    @Test
    public void shouldReturnOkWhenApplicationIsReady(){
        String expected = "Ok";

        String actual = discountCalculator.healthCheck();

        assertEquals(expected, actual);

    }

}