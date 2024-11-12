package tests;

import controller.Conventional1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Conventional1Test {

    @Test
    void testGetCostsByRome() {
        Conventional1 app = new Conventional1();
        int total = app.sumCostsByLocation("Rome");
        assertEquals(17_250_535, total);
    }

    @Test
    void testGetCostsByBolzano() {
        Conventional1 app = new Conventional1();
        int total = app.sumCostsByLocation("Bolzano");
        assertEquals(9_326_466, total);
    }

    @Test
    void testGetCostsByFlorence() {
        Conventional1 app = new Conventional1();
        int total = app.sumCostsByLocation("Florence");
        assertEquals(9_860_087, total);
    }
}
