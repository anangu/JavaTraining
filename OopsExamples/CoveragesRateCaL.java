package OopsExamples;

public class CoveragesRateCaL {
	static int CoveragesRateCal(int baseRate, int coverageRate) { // Method Overloading
		int premium = (coverageRate) * baseRate; // Base Rate is $32
		return premium;
	}

	static float CoveragesRateCal(double baseRate, double extdCovRate) {
		float premium = (float) (baseRate * extdCovRate);
		return premium;
	}

	public static void main(String[] args) {
		System.out.println(CoveragesRateCal(15, 32));
		System.out.println(CoveragesRateCal(32.00, 67.37));
	}
}
