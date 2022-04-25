package ex2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
public class DateEx1 {
	public static void main(String[] args) {
		Locale jp = new Locale("ja","","JP");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 (E)",jp);
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		calendar.add(Calendar.MONTH, 20);

		Date ds = calendar.getTime();
		System.out.println(sdf.format(ds));
	}
}
