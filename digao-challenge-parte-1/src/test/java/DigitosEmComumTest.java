import org.junit.Test;

import static org.junit.Assert.*;

public class DigitosEmComumTest {

    @Test
    public void test01() {
        assertTrue(DigaoChallenge.digitosEmComum(new int[] {12, 13, 17, 19, 79}));
    }

    @Test
    public void test02() {
        assertTrue(DigaoChallenge.digitosEmComum(new int[] {33, 53, 6351, 12, 2242, 44}));
    }

    @Test
    public void test03() {
        assertFalse(DigaoChallenge.digitosEmComum(new int[] {33, 44, 55, 66, 77}));
    }

    @Test
    public void test04() {
        assertFalse(DigaoChallenge.digitosEmComum(new int[] {1, 12, 123, 1234, 1235, 6789}));
    }

    @Test
    public void test05() {
        assertTrue(DigaoChallenge.digitosEmComum(new int[] {5789, 798, 98, 995, 599, 699}));
    }

    @Test
    public void test06() {
        assertFalse(DigaoChallenge.digitosEmComum(new int[] {5, 4, 44, 444}));
    }

    @Test
    public void test07() {
        assertTrue(DigaoChallenge.digitosEmComum(new int[] {5, 65, 66, 76, 78}));
    }

    @Test
    public void test08() {
        assertTrue(DigaoChallenge.digitosEmComum(new int[] {5, 55, 665, 66665555, 65, 66, 76, 78, 989}));
    }

    @Test
    public void test09() {
        /*Há diferentes formas que você pode testar seu código com Junit
        * Aqui com assertEquals estou esperando que seja false o retorno do método
        * o que poderia ter sido feito com o método assertFalse
        * Você pode pesquisar mais sobre todas as assertions do Junit para ver
        * todas as possibilidades que você pode validar se seu código está funcionando corretamente*/
        assertEquals(false, DigaoChallenge.digitosEmComum(new int[] {5, 55, 665, 4444, 65, 66, 76, 78, 989}));
    }

    @Test
    public void test10() {
        //mesma coisa que assertTrue
        assertEquals(true, DigaoChallenge.digitosEmComum(new int[] {1, 11, 12, 13, 14, 15, 16}));
    }
}
