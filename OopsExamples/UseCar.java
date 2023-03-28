package OopsExamples;

public class UseCar extends Car {// All methods are implemented in Concrete class ; when a class has even one
									// unimplemented method its abstract class.

	public void color() {
		System.out.println("black");
	}

	public static void main(String[] args) {
		UseCar uc = new UseCar();
		uc.brand();
		uc.color();
		uc.name();
		uc.a();
	}
}
