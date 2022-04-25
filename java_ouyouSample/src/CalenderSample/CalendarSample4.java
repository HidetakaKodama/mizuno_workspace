package CalenderSample;

import java.util.Calendar;
import java.util.Date;
public class CalendarSample4 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		System.out.println(date);
	}
}
