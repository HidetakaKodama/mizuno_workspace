package Ex6;

import java.util.Scanner;

public class Ex6_C1 {
	public static void main(String[] args) {
		for (int c = 1; c < 4; c++) {
			Scanner s = new Scanner (System.in);
			int num = s.nextInt(3);
			int ran = new java.util.Random().nextInt(3);

			user(num,ran,0,1,2);

		}
	}

			private static void user(int you, int cp,int gu, int tyo, int pa) {
				System.out.println("あなたの数字は"+ you);
				System.out.println("CPの数字は"+ cp);

		        switch (cp) {
		          case 0:
			        break;

		          case 1:
			        break;

		          case 2:
			        break;
		}

		        switch (you) {
		        case 0:
		        	break;

		        case 1:
		        	break;

		        case 2:
		        	break;
		        }

		        if(cp == you) {
		        	System.out.println("あいこ");
		        }
		        else if(((you == gu) && (cp == tyo)) || ((you == tyo) && (cp == pa)) || ((you == pa) || (cp == gu))) {
		        	System.out.println("かち");

		        }else if (((you == gu) && (cp == pa)) || ((you == tyo) && (cp == gu)) || ((you == pa) && (cp == tyo))){
		        	System.out.println("まけ");
		        }

//		        if ((you == gu) && (cp == tyo) || (you == tyo) && (cp == pa) || (you == pa) || (cp == gu)) {
//					System.out.println("かち");
//				} else if ((you == gu) && (cp == pa) || (you == tyo) && (cp == gu) || (you == pa) && (cp == tyo)) {
//					System.out.println("まけ");
//				} else {
//					System.out.println("あいこ");
//				}

	}
}