package Ex5;

public class Ex5_C1 {
	public static void main(String[] args) {
		int a [] = {18,-4,12,0,26,-18};

		boolean flag = true;
		  while (flag) {
			  flag = false;

			  for (int i = 1; i < a.length; i++) {
				  if(a[i - 1] > a[i]) {
					  int w = a[i];
					  a[i] = a[i-1];
					  a[i-1] = w;
					  flag = true;
				  }
			  }
			  }
			  for (int i = 0; i < a.length; i++) {
				  System.out.print(a[i] + " ");
		  }
	}
}
