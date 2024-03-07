import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class RettangoloTest {
    private Rettangolo rettangoloTest = new Rettangolo(7,5);

    @Test
    void calcolaArea() {
        String result = rettangoloTest.calcolaArea();
        assertEquals(String.valueOf(35), result, "L'area del rettangolo è: 35.0");

    }
}