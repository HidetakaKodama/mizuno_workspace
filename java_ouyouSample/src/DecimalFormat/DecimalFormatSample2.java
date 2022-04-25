package DecimalFormat;

import java.text.DecimalFormat;
public class DecimalFormatSample2 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###");
		int num = 1000000;
		String str = df.format(num);
		System.out.println(str);
	}
}
