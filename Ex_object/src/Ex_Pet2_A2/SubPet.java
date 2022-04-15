package Ex_Pet2_A2;

public class SubPet extends SuperPet{
	public String pet2;
	public void showPet2() {
		System.out.println("私は" + pet2 + "を飼っています。");
	}
	 public void showPets() {
		 System.out.println("私は" + pet1 + "と" + pet2 + "を両方飼っています。");
	 }
}
