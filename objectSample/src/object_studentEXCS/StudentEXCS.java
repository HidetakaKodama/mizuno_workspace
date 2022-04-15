package object_studentEXCS;

public class StudentEXCS extends HumanCS{
	public int id;
	public StudentEXCS(String name,int id) {
		super(name);
		this.id = id;
	}

	public void study() {
		System.out.println("勉強をします");
	}
}
