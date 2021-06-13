package org.selenium.learning;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTimeExample {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyyhh:mm:ss");
		String time = sdf.format(d).replace(":", "_");
		System.out.println(time);

	}

}
