package com.mycompany.app;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
    	String input = "08-AUG-12";
    	String pattern = "dd-MMM-yy";
    	DateTime date = DateTime.parse(input,
    			DateTimeFormat.forPattern(pattern)).withTimeAtStartOfDay();
		System.out.println("Number of days :"+Service.numberOfDays(date));
	}
}
