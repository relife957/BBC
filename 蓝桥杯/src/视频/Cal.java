package 视频;

import java.util.Calendar;

public class Cal {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance() ;
		cal.set(Calendar.YEAR, 1777);
		cal.set(Calendar.MONTH,3);
		cal.set(Calendar.DATE,30);
		cal.add(Calendar.DATE, 5343);
		System.out.println(cal.get(Calendar.YEAR)+" "+cal.get(Calendar.MONTH)+" "+cal.get(Calendar.DATE));
		cal.get(Calendar.DAY_OF_WEEK);
	}
}
