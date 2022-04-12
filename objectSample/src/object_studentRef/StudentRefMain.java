package object_studentRef;

import object_Student.Student;

public class StudentRefMain {
	public static void main(String[] args) {
		Student std1 = new Student();
		Student std2 = std1;
		std1.id = 1001;
		std1.name = "山田太郎";
		std1.introduce();
		std2.introduce();
	}
}
