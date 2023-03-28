
public class PrintStarts {

	printStars(i);
			System.out.println();
		}
	// printStars2(3);

	}

	public static void printStars(int numberOfStars) {
		for (int j = numberOfStars; j >= 1; j--) {
			System.out.print("*");
		}
	}

	public static void printStars2(int numOfStars) {
		for (int l = numOfStars; l <= 1; l--) {
			for (int m = l; m <= 1; m--) {
				for (int n = m; n <= 1; n--) {
					System.out.println("*");
				}
				System.out.println();
			}
		}
	}
}
