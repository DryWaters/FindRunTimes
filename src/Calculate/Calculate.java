package Calculate;

// Class with all static formulas to calculate the run times
// of various functions
class Calculate {

    Calculate() {
        System.out.println("This program will print out the number of operations that can be");
        System.out.println("completed in one second, minute, hour, day, month, year if the");
        System.out.println("operation time is log(n), square root (n), n, n log(n), n^2, 2^n.\n\n");
    }

    void calculateValues() {

        // Find the value of log(n), even though all values are larger than Double.MAX
        System.out.println("Calculating log(n)");
        for (int i = 0; i < Constants.allValues.length; i++) {
            System.out.printf("%-10s %15.5E\n", Constants.names[i],
                    logN(Constants.allValues[i]));
        }
        System.out.println();

        // Find the value of square root of (n)
        System.out.println("Calculating square root(N)");
        for (int i = 0; i < Constants.allValues.length; i++) {
            System.out.printf("%-10s %15.5E\n", Constants.names[i],
                    squareRootN(Constants.allValues[i]));
        }
        System.out.println();

        // Find the value of square root of (n)
        System.out.println("Calculating n)");
        for (int i = 0; i < Constants.allValues.length; i++) {
            System.out.printf("%-10s %15.0f\n", Constants.names[i], Constants.allValues[i]);
        }
        System.out.println();

        // Find the value of n log(n).  The values are so large that to save time, I set the start value
        // after NUMBER_OF_HOURS.  The found value is passed into the function as the starting value for the
        // next calculation on NUMBER_OF_SECONDS, NUMBER_OF_MINUTES, NUMBER_OF_HOURS.
        System.out.println("Calculating nLogN");
        double lastValue = 0;
        for (int i = 0; i < Constants.allValues.length; i++)
        {
            if (i == 3) {
                lastValue = 2.7E9;
            } else if (i == 4) {
                lastValue = 7.2829E10;
            } else if (i == 5) {
                lastValue = 7.975E11;
            }
            lastValue = nLogN(Constants.allValues[i], lastValue);
            System.out.printf("%-10s %15.0f\n", Constants.names[i], lastValue);
        }
        System.out.println();

        // Find the value of n^2
        System.out.println("Calculating N^2");
        for (int i = 0; i < Constants.allValues.length; i++) {
            System.out.printf("%-10s %15.0f\n", Constants.names[i],
                    nSquare(Constants.allValues[i]));
        }
        System.out.println();

        // Find the value of 2^n
        System.out.println("Calculating 2^N");
        for (int i = 0; i < Constants.allValues.length; i++) {
            System.out.printf("%-10s %15.0f\n", Constants.names[i],
                    twoN(Constants.allValues[i]));
        }
        System.out.println();
    }

    // Find the value of log(n) by converting the number of
    // microseconds to exponential form
    private double logN(double value) {
        return Math.floor((Math.pow(2.0, value)));
    }

    // Find the value of square root of n, by raising the number of
    // microseconds to the power of 2
    private double squareRootN(double value) {
        return Math.floor(Math.pow(value, 2.0));
    }

    // Find the value of n log(n), by steadily increasing a counter until it is larger
    // than the needed number of microseconds.  It calculates using the change of base formula
    private double nLogN(double value, double startValue) {
        double counter = startValue;
        double testValue = 0;
        while (testValue < value) {
            counter++;
            testValue = counter * (Math.log(counter) / Math.log(2));
        }
        return --counter;
    }

    // Find the value of n^2 by finding the square root of the number of microseconds
    private double nSquare(double value) {
        return Math.floor(Math.sqrt(value));
    }

    // Find the value of 2^n by changing to log form and solving for n
    // Example for seconds.  1sec = 10^6 microseconds
    // 2^n = 10^6 converts to
    // n ln 2 = 6 ln 10 -> moving the ln 2 to the other side leaves
    // n = (6 ln 10) / (ln 2)
    private double twoN(double value) {
        return Math.floor(Math.log(value) / Math.log(2));
    }
}

