package Ex6;

public class Ex6_B2 {
	public static void main(String[] args) {
		int m = 80;
		int n = 40;
		int a = gcd(m,n);
		System.out.print(a);
	}

	public static int gcd(int m, int n) {
		int r;
		while( n > 0) {
			r = m % n;
			m = n;
			n = r;
		}
		return m;
	}
}