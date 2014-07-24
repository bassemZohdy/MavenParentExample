package com.mycompany.app;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ServiceTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ServiceTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ServiceTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testService()
    {
    	String input = "08-AUG-12";
    	String pattern = "dd-MMM-yy";
    	DateTime date = DateTime.parse(input,
    			DateTimeFormat.forPattern(pattern)).withTimeAtStartOfDay();
        assertEquals(716, Service.numberOfDays(date));
    }
}
