package DateSample;

import java.text.SimpleDateFormat;
import java.util.Date;
public class DateSample2 {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");
		Date date = new Date();
		String dateStr = sdf.format(date);
		System.out.println(dateStr);
	}
}
