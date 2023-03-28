package OopsExamples;

public class UseEmployee {
	public static void main(String[] args) {

		EmployeeEncapsulation e = new EmployeeEncapsulation();

		e.setEmpId(112);
		e.setName("manju");
		e.setSalary(100000);
		System.out.println(e.getEmpId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());

	}
}
