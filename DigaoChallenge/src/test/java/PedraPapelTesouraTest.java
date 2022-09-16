import exception.DigaoException;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class PedraPapelTesouraTest {
    @Test
    public void test1() {
        assertEquals("Jogador 2 Venceu!", DigaoChallenge.pedraPapelTesoura("pedra", "papel"));
    }

    @Test
    public void test2() {
        assertEquals("Jogador 1 Venceu!", DigaoChallenge.pedraPapelTesoura("PapEl", "PEDRA"));
    }

    @Test
    public void test3() {
        assertEquals("Jogador 2 Venceu!", DigaoChallenge.pedraPapelTesoura("papeL", "TesOuRa"));
    }

    @Test
    public void test4() {
        assertEquals("Empate!", DigaoChallenge.pedraPapelTesoura("TESOURA", "tesoura"));
    }

    @Test
    public void test5() {
        assertEquals("Jogador 1 Venceu!", DigaoChallenge.pedraPapelTesoura("teSoURa", "Papel"));
    }

    @Test
    public void test6() {
        DigaoException exception = assertThrows(DigaoException.class, () -> {
            DigaoChallenge.pedraPapelTesoura("robson", "tesoura");
        });
        assertEquals("Opção: robson do Jogador 1 é inválida!", exception.getMessage());
    }

    @Test
    public void test7() {
        DigaoException exception = assertThrows(DigaoException.class, () -> {
            DigaoChallenge.pedraPapelTesoura("Pedra", "Preda");
        });
        assertEquals("Opção: Preda do Jogador 2 é inválida!", exception.getMessage());
    }

    @Test
    public void test8() {
        DigaoException exception = assertThrows(DigaoException.class, () -> {
            DigaoChallenge.pedraPapelTesoura("Paper", "Preda");
        });
        assertEquals("Ambas opções são inválidas, melhorem!", exception.getMessage());
    }

}
