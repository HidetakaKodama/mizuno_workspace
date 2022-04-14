package object_StudentEC;

public class StudentEC {
	private int id;
	private String name;
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void introduce() {
		System.out.println("学籍番号=" + this.id);
		System.out.println("氏名=" + this.name);
	}
}
