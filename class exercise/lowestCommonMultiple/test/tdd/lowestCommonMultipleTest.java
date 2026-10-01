import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.lowestCommonMultiple;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class lowestCommonMultipleTest {
    lowestCommonMultiple lcm;
    @BeforeEach
    public void setUp() {
        lcm = new lowestCommonMultiple();
    }
    @Test
    void testForTheGreatestCommonDivisor() {
        int[] given = {8, 10, 24};
        //when
        int[] expec = {2,2,2,3,5};
        int[] actual = lcm.getFactors(given);
        assertArrayEquals(expec, actual);
    }
}