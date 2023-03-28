package OopsExamples;

public class GreenApple extends Apple {
	public void price() {
		System.out.println("120");

	}

	public static void main(String[] args) {
		GreenApple ga = new GreenApple();
		ga.name();
		ga.color();
		ga.price();
	}

}
