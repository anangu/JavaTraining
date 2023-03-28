package OopsExamples;

public class CollisionCovRate {
	public static void main(String[] args) {
		int driverAge = 21;
		if ((driverAge >= 12) && (driverAge <= 16)) {
			int newCollCovRate = CollCovRate(3, 17);
			System.out.println("Youngest Driver Collision Coverage Rate is " + newCollCovRate);
		} else if ((driverAge > 16) && (driverAge <= 25)) {
			float newCollCovRate = CollCovRate(2, 17, .2f);
			System.out.println("Young Driver Collision Covrage Rate is " + newCollCovRate);
		} else if ((driverAge > 25) && (driverAge <= 65)) {
			float newCollCovRate = CollCovRate(17, .5f);
			System.out.println("Young Driver Collision Covrage Rate is " + newCollCovRate);
		}

	}

	public static int CollCovRate(int youngestDriverCollRate, int collBaseRate) {
		return youngestDriverCollRate * collBaseRate;
	}

	public static float CollCovRate(int youngDriverCollRate, int collBaseRate, float youngDriverDiscount) {
		return youngDriverCollRate * collBaseRate * youngDriverDiscount;
	}

	public static float CollCovRate(int collBaseRate, float driverDiscount) {
		return collBaseRate * driverDiscount;
	}
}
