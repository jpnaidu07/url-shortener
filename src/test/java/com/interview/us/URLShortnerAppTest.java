package com.interview.us;

import java.util.Map;

import com.interview.us.utils.Storage;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 * 
 * @author JayaPrakash
 */
public class URLShortnerAppTest extends TestCase {

	public static int keylength = 5;
	public static String url = "https://www.google.com/maps/@13.1898846,78.7362839,15z";
	public static String domain = "https://deloitte.tiny";

	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public URLShortnerAppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(URLShortnerAppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	 
	public void testApp() {

		if (System.getProperty("keyLength") != null) {

			if (Integer.valueOf(System.getProperty("keyLength")) > 10
					&& Integer.valueOf(System.getProperty("keyLength")) < 0) {
				System.out.println(
						"keylength greater than 10 or negative number will not be taken coz url will not be tiny any more");
				keylength = 5;
			} else {
				keylength = Integer.valueOf(System.getProperty("keyLength"));
			}
		}

		if (System.getProperty("url") != null) {
			url = System.getProperty("url");
		}

		if (System.getProperty("domain") != null) {
			domain = System.getProperty("domain");
		}

		System.out.println("\n::::::::::Create Short URL for given URL:::::::::::::::::\n");
		System.out.println("URL::" + url);
		System.out.println();
		System.out.println("Shortened URL:: " + URLShortnerApp.getShortURL(url, keylength, domain));
		System.out.println();
		
		getRedirectUrl();
		assertTrue(true);
		
		

	}
	
	private static void getRedirectUrl(){
		
		System.out.println("::::::::::Fetching the redirect URL for stored short URL::::::::::");
		Map.Entry<String,String> entry = Storage.map.entrySet().iterator().next();
		System.out.println();
		System.out.println("Shortened URL::" + domain + "/" +entry.getKey());
		System.out.println();
		System.out.println("Redirect URL:: " +  URLShortnerApp.redirectShortURL(domain + "/" +entry.getKey()));
		System.out.println();

	}
}
