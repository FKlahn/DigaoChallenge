import exception.DigaoException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class SomaBasicaTest {
    @Test
    public void deveRealizarSomaBasicaCorretamenteQuandoAmbosValoresForemValidos() {
        Integer valor1 = 7;
        Integer valor2 = 10;
        Integer resultadoEsperado = 17;

        assertEquals(resultadoEsperado, DigaoChallenge.somaBasica(valor1, valor2));

    }

    @Test
    public void deveLancarDigaoExceptionQuandoValor1ForNulo() {
        Integer valor1 = null;
        Integer valor2 = 10;

        assertThrows(DigaoException.class, () -> {
            DigaoChallenge.somaBasica(valor1, valor2);
        });

    }

    @Test
    public void deveLancarDigaoExceptionQuandoValor2ForNulo() {
        Integer valor1 = 10;
        Integer valor2 = null;

        assertThrows(DigaoException.class, () -> {
            DigaoChallenge.somaBasica(valor1, valor2);
        });

    }
}
