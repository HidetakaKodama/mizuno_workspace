package object_StudentOL;

public class StudentOL {
	int id;
	String name;
	StudentOL(int id,String name){
		this.id = id;
		this.name = name;
	}
	StudentOL(int id){
		this(id,"未入力");
	}
	void introduce() {
		System.out.println("学籍番号=" + id);
		System.out.println("氏名=" + name);
	}
}
