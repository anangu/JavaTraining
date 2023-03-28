
public class SpeedConvertor {
	public static void main(String[] args) {
		toMilesPerHour(1.5);
		toMilesPerHour(10.25);
		toMilesPerHour(-5.6);
		toMilesPerHour(25.42);
		toMilesPerHour(75.114);
	}

	public static long toMilesPerHour(double kilometerPerHour) {
		if (kilometerPerHour < 0) {
			return -1;
		} else {
			long milesRounded = (long) Math.round(0.621371 * kilometerPerHour);
			long roundedKilometers = (long) Math.round(kilometerPerHour);// Type Casting here double data type parameter
																			// to long one
			System.out.println("Rounded Long Value: " + roundedKilometers);
			System.out.println(" " + kilometerPerHour + "km is " + milesRounded + "miles.");

			return roundedKilometers;
		}
	}

}
