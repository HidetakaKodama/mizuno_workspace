package object_StudentOL;

public class StudentOLMain {
	public static void main(String[] args) {
		StudentOL std1 = new StudentOL(1001,"山田太郎");
		StudentOL std2 = new StudentOL(1002);
		std1.introduce();
		std2.introduce();
	}
}
