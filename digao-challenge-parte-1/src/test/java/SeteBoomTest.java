import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeteBoomTest {
    String retornoEsperado1 = "Boom!";
    String retornoEsperado2 = "Bomba não acionada!";

    @Test
    public void test1(){
        assertEquals(retornoEsperado1, DigaoChallenge.seteBoom(new int[] {7,6,5,4,3,2,1}));
    }

    @Test
    public void test2(){
        assertEquals(retornoEsperado2, DigaoChallenge.seteBoom(new int[] {8,6,5,4,3,2,1}));
    }
}
