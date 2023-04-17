package firstNonRepeatingNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testThat9isFirstUnique() {
        int[] x = {9, 2, 3, 2, 6, 6};
        int num = Main.findFirstNonRepeatingNumber(x);

        assertEquals(9, num);
    }

    @Test
    void testThat5isFirstUnique() {
        int[] x = {4, 5, 1, 2, 0, 4};
        int num = Main.findFirstNonRepeatingNumber(x);

        assertEquals(5, num);
    }

    @Test
    void testThatNoUniqueNumber() {
        int[] x = {3, 3, 2, 2, 6, 6, 3};
        assertThrows(IllegalArgumentException.class, () -> Main.findFirstNonRepeatingNumber(x));
    }

}