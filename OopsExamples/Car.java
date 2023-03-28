package OopsExamples;

public abstract class Car implements Vehicle, Test {// Abstract class has both implemented and unimplemented method
	public void brand() {
		System.out.println("Audi");

	}

	public void name() {
		System.out.println("Version1");
	}

	/*
	 * public void color() { System.out.println("black"); }
	 */
	public void a() {
		System.out.println("test interface");
	}
}
