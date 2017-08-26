public class CalculateMain {

    public static void main(String... args) {

        System.out.println("Calculating log(n)");
        for (double value : Constants.allValues) {
            System.out.println(Calculate.logN(value));
        }
        System.out.println();

        System.out.println("Calculating square root(N)");
        for (double value : Constants.allValues) {
            System.out.println(Calculate.squareRootN(value));
        }
        System.out.println();

        System.out.println("Calculating nLogN");

        double lastValue = Calculate.nLogN(Constants.NUMBER_MICROSECONDS_IN_SECOND, 0);

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
            System.out.println(i + "  " + lastValue);
        }
        System.out.println();

        System.out.println("Calculating N^2");
        for (double value : Constants.allValues) {
            System.out.println(Calculate.nSquare(value));
        }
        System.out.println();

        System.out.println("Calculating 2^N");
        for (double value : Constants.allValues) {
            System.out.println(Calculate.twoN(value));
        }
        System.out.println();






    }
}
