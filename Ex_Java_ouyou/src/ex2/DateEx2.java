package ex2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class DateEx2 {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		calendar.add(Calendar.DAY_OF_MONTH,-30);

		Date ds = calendar.getTime();
		System.out.println(sdf.format(ds));
	}

}
