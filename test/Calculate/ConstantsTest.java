package Calculate;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstantsTest {

    private double[] allValues;

    @Before
    public void setUp() throws Exception {
        allValues = Constants.getAllValues();
    }

    @Test
    public void constantValuesTest() {
        // Microseoncds -> Second
        assertEquals(allValues[0], 1.0E6, 0);
        assertNotEquals(allValues[0], 1.0, 0);

        // Microseconds -> Minute
        assertEquals(allValues[1], 6.0E7, 0);
        assertNotEquals(allValues[1], 1.0, 0);

        // Microseconds -> Hour
        assertEquals(allValues[2], 3.6E9, 0);
        assertNotEquals(allValues[2], 2.0, 0);

        // Microseconds -> Day
        assertEquals(allValues[3], 8.64E10, 0);
        assertNotEquals(allValues[3], 2.0, 0);

        // Microseconds -> Month
        assertEquals(allValues[4], 2.6280E12, 0);
        assertNotEquals(allValues[4], 3.0, 0);

        // Microseconds -> Year
        assertEquals(allValues[5], 3.1536E13, 0);
        assertNotEquals(allValues[5], 2.3, 0);
    }
}