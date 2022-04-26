package ex5.entity;

public class Trainee {
	private int id; //研修生ID
	private String name; //名前
	private int age; //年齢
	private String sex; //性別
	private int unitId; //単元ID
	private int coId; //会社ID

	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public String getSex() {return sex;}
	public void setSex(String sex) {this.sex = sex;}
	public int getUnitId() {return unitId;}
	public void setUnitId(int unitId) {this.unitId = unitId;}
	public int getCoId() {return coId;}
	public void setCoId(int coId) {this.coId = coId;}
	}