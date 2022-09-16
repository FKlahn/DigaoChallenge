import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcularUmMaisUmTest {

    @Test
    public void deveCalcularUmMaisUmCorretamente() {
        int retornoEsperado = 2;

        assertEquals(retornoEsperado, DigaoChallenge.calcularUmMaisUm());
    }
}
