import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class TriangoloTest {
    private Triangolo triangoloTest = new Triangolo(7,6);

    @Test
    void calcolaArea() {
        String result = triangoloTest.calcolaArea();
        assertEquals(String.valueOf(21), result, "L'area del triangolo è: 21.0");

    }
}