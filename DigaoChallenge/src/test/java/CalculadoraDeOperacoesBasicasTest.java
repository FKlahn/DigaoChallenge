import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraDeOperacoesBasicasTest {
    @Test
    public void test01() {
        assertEquals(3, DigaoChallenge.calculadoraDeOperacoesBasicas("1", "2", "somar"));
    }

    @Test
    public void test02() {
        assertEquals(-19, DigaoChallenge.calculadoraDeOperacoesBasicas("1", "-20", "somar"));
    }

    @Test
    public void test03() {
        assertEquals(Integer.MIN_VALUE,  DigaoChallenge.calculadoraDeOperacoesBasicas("9", "0", "dividir"));
    }

    @Test
    public void test04() {
        assertEquals(100, DigaoChallenge.calculadoraDeOperacoesBasicas("10", "10", "multiplicar"));
    }

    @Test
    public void test05() {
        assertEquals(100, DigaoChallenge.calculadoraDeOperacoesBasicas("-10", "-10", "multiplicar"));
    }

    @Test
    public void test06() {
        assertEquals(0, DigaoChallenge.calculadoraDeOperacoesBasicas("10", "10", "subtrair"));
    }

    @Test
    public void test07() {
        assertEquals(0, DigaoChallenge.calculadoraDeOperacoesBasicas("0", "0", "subtrair"));
    }

    @Test
    public void test08() {
        assertEquals(0, DigaoChallenge.calculadoraDeOperacoesBasicas("0", "1", "dividir"));
    }

    @Test
    public void test09() {
        assertEquals(0, DigaoChallenge.calculadoraDeOperacoesBasicas("0", "25415", "dividir"));
    }

    @Test
    public void test10() {
        assertEquals(1, DigaoChallenge.calculadoraDeOperacoesBasicas("4", "3", "dividir"));
    }

    @Test
    public void test11() {
        assertEquals(5, DigaoChallenge.calculadoraDeOperacoesBasicas("21", "4", "dividir"));
    }

    @Test
    public void test12() {
        assertEquals(4, DigaoChallenge.calculadoraDeOperacoesBasicas("13", "3", "dividir"));
    }

    @Test
    public void test13() {
        assertEquals(Integer.MIN_VALUE, DigaoChallenge.calculadoraDeOperacoesBasicas("13", "0", "dividir"));
    }

    @Test
    public void test14() { assertEquals(-4, DigaoChallenge.calculadoraDeOperacoesBasicas("500.15", "-123.12", "dividir")); }

}
