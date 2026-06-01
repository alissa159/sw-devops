import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void freeShippingWhenOrderPriceIsOver30000() {
        int result = Main.calculate(30000);

        assertEquals(0, result);
    }
}
