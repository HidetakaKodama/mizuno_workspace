package DecimalFormat;


import java.text.DecimalFormat;
public class DecimalFormat1 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0000");
		int num = 1;
		String str = df.format(num);
		System.out.println(str);
	}
}
