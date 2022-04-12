package object_Student;

public class StudentMain {
	public static void main(String[] args) {
		Student std1 = new Student();
		Student std2 = new Student();

		std1.id = 1001;
		std1.name = "山田太郎";
		std2.id = 1002;
		std2.name = "河野花子";

		std1.introduce();
		std2.introduce();
	}
}
