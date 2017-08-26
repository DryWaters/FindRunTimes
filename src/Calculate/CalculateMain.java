package Calculate;

public class CalculateMain {

    public static void main(String... args) {

        // Find the value of log(n), even though all values are larger than Double.MAX
        System.out.println("Calculating log(n)");
        for (int i = 0; i < Constants.allValues.length; i++) {
            System.out.printf("%-10s %15.5E\n", Constants.names[i],
                    Calculate.logN(Constants.allValues[i]));
        }
        System.out.println();

        // Find the value of square root of (n)
        System.out.println("Calculating square root(N)");
        for (int i = 0; i < Constants.allValues.length; i++) {
            System.out.printf("%-10s %15.5E\n", Constants.names[i],
                    Calculate.squareRootN(Constants.allValues[i]));
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
            lastValue = Calculate.nLogN(Constants.allValues[i], lastValue);
            System.out.printf("%-10s %15.0f\n", Constants.names[i], lastValue);
        }
        System.out.println();

        // Find the value of n^2
        System.out.println("Calculating N^2");
        for (int i = 0; i < Constants.allValues.length; i++) {
            System.out.printf("%-10s %15.0f\n", Constants.names[i],
                    Calculate.nSquare(Constants.allValues[i]));
        }
        System.out.println();

        // Find the value of 2^n
        System.out.println("Calculating 2^N");
        for (int i = 0; i < Constants.allValues.length; i++) {
            System.out.printf("%-10s %15.0f\n", Constants.names[i],
                    Calculate.twoN(Constants.allValues[i]));
        }
        System.out.println();
    }
}
