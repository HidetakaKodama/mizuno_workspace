import java.util.Scanner;
public class Ex1_B1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		System.out.println("千の位は、" + num / 1000);
		System.out.println("百の位は、" + num / 100 % 10);
		System.out.println("十の位は、" + num / 10 % 10);
		System.out.println("一の位は、" + num  % 10);
	}
}
