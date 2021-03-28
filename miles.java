/**
 *   Name: Samuel Adams Adjin
 */


public class Miles {
    public static long toMilesPerHour(double kilometersPerHour) {

        double miles = kilometersPerHour / 1.609;
        long round = Math.round(miles);

        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return round;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        long miles = toMilesPerHour(kilometersPerHour);
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " Km/h = " + miles + " mi/h");
        }

    }
}
