package Calculate;

// Class with all static formulas to calculate the run times
// of various functions
class Calculate {

    // Find the value of log(n) by converting the number of
    // microseconds to exponential form
    static double logN(double value) {
        return Math.floor((Math.pow(2.0, value)));
    }

    // Find the value of square root of n, by raising the number of
    // microseconds to the power of 2
    static double squareRootN(double value) {
        return Math.floor(Math.pow(value, 2.0));
    }

    // Find the value of n log(n), by steadily increasing a counter until it is larger
    // than the needed number of microseconds.  It calculates using the change of base formula
    static double nLogN(double value, double startValue) {
        double counter = startValue;
        double testValue = 0;
        while (testValue < value) {
            counter++;
            testValue = counter * (Math.log(counter) / Math.log(2));
        }
        return --counter;
    }

    // Find the value of n^2 by finding the square root of the number of microseconds
    static double nSquare(double value) {
        return Math.floor(Math.sqrt(value));
    }

    // Find the value of 2^n by changing to log form and solving for n
    // Example for seconds.  1sec = 10^6 microseconds
    // 2^n = 10^6 converts to
    // n ln 2 = 6 ln 10 -> moving the ln 2 to the other side leaves
    // n = (6 ln 10) / (ln 2)
    static double twoN(double value) {
        return Math.floor(Math.log(value) / Math.log(2));
    }
}

