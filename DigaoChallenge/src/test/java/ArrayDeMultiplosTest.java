import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class ArrayDeMultiplosTest {

    @Test
    public void test1() {
        assertArrayEquals(new int[] { 7, 14, 21, 28, 35 }, DigaoChallenge.arrayDeMultiplos(7, 5));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[] { 12, 24, 36, 48, 60, 72, 84, 96, 108, 120 }, DigaoChallenge.arrayDeMultiplos(12, 10));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[] { 17, 34, 51, 68, 85, 102, 119 }, DigaoChallenge.arrayDeMultiplos(17, 7));
    }

    @Test
    public void test4() {
        assertArrayEquals(new int[] { 630, 1260, 1890, 2520, 3150, 3780, 4410, 5040, 5670, 6300, 6930, 7560, 8190, 8820 }, DigaoChallenge.arrayDeMultiplos(630, 14));
    }

    @Test
    public void test5() {
        assertArrayEquals(new int[] { 140, 280, 420 }, DigaoChallenge.arrayDeMultiplos(140, 3));
    }

    @Test
    public void test6() {
        assertArrayEquals(new int[] { 7, 14, 21, 28, 35, 42, 49, 56 }, DigaoChallenge.arrayDeMultiplos(7, 8));
    }

    @Test
    public void test7() {
        assertArrayEquals(new int[] { 11, 22, 33, 44, 55, 66, 77, 88, 99, 110, 121, 132, 143, 154, 165, 176, 187, 198, 209, 220, 231 }, DigaoChallenge.arrayDeMultiplos(11, 21));
    }
}
