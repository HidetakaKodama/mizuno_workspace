package object_StudentCS;

public class StudentCS {
	int id;
	String name;
	StudentCS(int id,String name){
		this.id = id;
		this.name = name;
	}

	void introduce() {
		System.out.println("学籍番号=" + this.id);
		System.out.println("氏名=" + this.name);
	}
}
