package objct_StudentOR;

public class StudentOR extends Human{

	public int id;
	public void work() {
		System.out.println("勉強をします");
	}

	@Override
	public void introduce() {
		super.introduce();
		System.out.println("学籍番号=" + id);
	}
}
