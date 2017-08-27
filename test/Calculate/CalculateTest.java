package Calculate;

import org.junit.Before;
import org.junit.Test;

import java.lang.instrument.IllegalClassFormatException;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class CalculateTest {

    private Calculate testCalculate;

    @Before
    public void setUp() throws Exception {
        testCalculate = new Calculate();
    }

    @Test
    public void logNTest() throws Exception {
        Class args = Double.TYPE;
        Method logNMethod = getPrivateMethod("logN", args);
        assertEquals(1.0, logNMethod.invoke(testCalculate, 1.0));
        assertNotEquals(1.0, logNMethod.invoke(testCalculate, 2.0));
    }

    @Test
    public void squareRootNTest() throws Exception {
        Class args = Double.TYPE;
        Method squareRootNMethod = getPrivateMethod("squareRootN", args);
        assertEquals(9.0, squareRootNMethod.invoke(testCalculate, 3.0));
        assertNotEquals(4.0, squareRootNMethod.invoke(testCalculate, 1.5));
    }

    @Test
    public void nLogNTest() throws Exception {
        Class[] args = { Double.TYPE, Double.TYPE };
        Method nLogNMethod = getPrivateMethod("nLogN", args);
        assertEquals(2.0, nLogNMethod.invoke(testCalculate, 4.0, 0.0));
        assertNotEquals(5.4, nLogNMethod.invoke(testCalculate, 4.0, 0.0));
    }

    @Test
    public void nSquareTest() throws Exception {
        Class args = Double.TYPE;
        Method nSquareMethod = getPrivateMethod("nSquare", args);
        assertEquals(3.0, nSquareMethod.invoke(testCalculate, 9.0));
        assertNotEquals(5.0, nSquareMethod.invoke(testCalculate, 9.0));
    }

    @Test
    public void twoNTest() throws Exception {
        Class args = Double.TYPE;
        Method twoNMethod = getPrivateMethod("twoN", args);
        assertEquals(4.0, twoNMethod.invoke(testCalculate, 16.0));
        assertNotEquals(2.0, twoNMethod.invoke(testCalculate, 10.0));

    }

    private Method getPrivateMethod(String methodName, Class... args) throws NoSuchMethodException {
        Method method = Calculate.class.getDeclaredMethod(methodName, args);
        method.setAccessible(true);
        return method;
    }

}