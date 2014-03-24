package us.fatehi.timeapi.more;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class UglyOldApi {

	public static void main(String[] args) {
		
		Calendar calendar = new GregorianCalendar();
		Date date = calendar.getTime();
		System.out.println(date);
		
	}
	
}
