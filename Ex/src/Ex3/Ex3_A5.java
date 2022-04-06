package Ex3;

public class Ex3_A5 {
	public static void main(String[] args) {
		int j = 1;

//		for文
//		for (int i = 1; i <= 5; i++) {
//			j = j * i;
//		}
//		System.out.println(j);
//
//		while文
//			int i = 1;
//			while(i <= 5) {
//				j = j * i;
//				i++;
//			}
//			System.out.println(j);

			int i = 1;
			do {

				j = j * i;
				i++;
			}while(i <= 5);
               System.out.println(j);
	}
}
