package Ex_Employee2_A3;

public class EmployeeMain {
	public static void main(String[] args) {
		MedicalEmp m = new MedicalEmp();
		m.age = 30;
		m.height = 170.5;
		m.info();
		m.introduce();

		Employee e = new Employee();
		e.age = 40;
		e.height = 172.3;
		e.info();
		e.introduce();
	}
}
