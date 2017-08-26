public class Calculate {

    public static double logN(double value) {
        return Math.floor((Math.pow(2.0, value)));
    }

    public static double squareRootN(double value) {
        return Math.floor(Math.pow(value, 2.0));
    }

    public static double nLogN(double value, double startValue) {
        double counter = startValue;
        double testValue = 0;
        while (testValue < value) {
            counter++;
            testValue = counter * (Math.log(counter) / Math.log(2));
        }
        return --counter;
    }

    public static double nSquare(double value) {
        return Math.floor(Math.sqrt(value));
    }

    public static double twoN(double value) {
        return Math.floor(Math.log(value) / Math.log(2));
    }
}

