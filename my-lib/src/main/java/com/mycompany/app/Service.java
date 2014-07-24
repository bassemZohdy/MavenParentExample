package com.mycompany.app;

import org.joda.time.DateTime;
import org.joda.time.Days;

/**
 * Hello world!
 *
 */
public class Service {
	public static int numberOfDays(DateTime date) {
		DateTime now = DateTime.now().withTimeAtStartOfDay();
		return Days.daysBetween(date, now).getDays();

	}
}
