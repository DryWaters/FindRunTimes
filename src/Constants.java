public class Constants {

    Constants() {}

    public static final double DAYS_PER_YEAR = 365;
    public static final double DAYS_PER_MONTH = DAYS_PER_YEAR / 12;

    public static final double NUMBER_MICROSECONDS_IN_SECOND = 1000000;
    public static final double NUMBER_MICROSECONDS_IN_MINUTE = NUMBER_MICROSECONDS_IN_SECOND * 60;
    public static final double NUMBER_MICROSECONDS_IN_HOUR = NUMBER_MICROSECONDS_IN_MINUTE * 60;
    public static final double NUMBER_MICROSECONDS_IN_DAY = NUMBER_MICROSECONDS_IN_HOUR * 24;
    public static final double NUMBER_MICROSECONDS_IN_MONTH = NUMBER_MICROSECONDS_IN_DAY * DAYS_PER_MONTH;
    public static final double NUMBER_MICROSECONDS_IN_YEAR = NUMBER_MICROSECONDS_IN_DAY * DAYS_PER_YEAR;

    public static final double[] allValues = {
            NUMBER_MICROSECONDS_IN_SECOND,
            NUMBER_MICROSECONDS_IN_MINUTE,
            NUMBER_MICROSECONDS_IN_HOUR,
            NUMBER_MICROSECONDS_IN_DAY,
            NUMBER_MICROSECONDS_IN_MONTH,
            NUMBER_MICROSECONDS_IN_YEAR };

}
