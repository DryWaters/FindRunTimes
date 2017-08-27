package Calculate;

import java.util.Arrays;

// Class to hold to calculate the number of microseconds in
// Seconds, Minutes, Hours, Days, Months, and Year
// and stores them in an array
class Constants {
    Constants() {}

    private static final double DAYS_PER_YEAR = 365;
    private static final double DAYS_PER_MONTH = DAYS_PER_YEAR / 12;

    private static final double NUMBER_MICROSECONDS_IN_SECOND = 1000000;
    private static final double NUMBER_MICROSECONDS_IN_MINUTE = NUMBER_MICROSECONDS_IN_SECOND * 60;
    private static final double NUMBER_MICROSECONDS_IN_HOUR = NUMBER_MICROSECONDS_IN_MINUTE * 60;
    private static final double NUMBER_MICROSECONDS_IN_DAY = NUMBER_MICROSECONDS_IN_HOUR * 24;
    private static final double NUMBER_MICROSECONDS_IN_MONTH = NUMBER_MICROSECONDS_IN_DAY * DAYS_PER_MONTH;
    private static final double NUMBER_MICROSECONDS_IN_YEAR = NUMBER_MICROSECONDS_IN_DAY * DAYS_PER_YEAR;

    private static final double[] allValues = {
            NUMBER_MICROSECONDS_IN_SECOND,
            NUMBER_MICROSECONDS_IN_MINUTE,
            NUMBER_MICROSECONDS_IN_HOUR,
            NUMBER_MICROSECONDS_IN_DAY,
            NUMBER_MICROSECONDS_IN_MONTH,
            NUMBER_MICROSECONDS_IN_YEAR };

    private static final String[] names = {
            "One Second",
            "One Minute",
            "One Hour",
            "One Day",
            "One Month",
            "One Year"
    };

    static double[] getAllValues() {
        return Arrays.copyOf(allValues, allValues.length);
    }

    static String[] getAllNames() {
        return Arrays.copyOf(names, names.length);
    }
}
