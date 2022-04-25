package StringSample;

public class StringSample6 {
	public static void main(String[] args) {
		String str = "りんご:みかん:もも";
		String[] values = str.split(":");
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
	}
}
