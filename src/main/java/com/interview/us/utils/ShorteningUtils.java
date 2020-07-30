package com.interview.us.utils;

import java.util.Random;

/**
 * This utility class contains the methods being used by app and services
 */ 

public class ShorteningUtils {

	public static int keySize = 5;

	public static Random random = new Random();

	public static char[] myChars = new char[62];

	public static String domain = "deloitte.in";

	/*
	 * This method can be used to validate and enhance the actual url
	 */
	public static boolean evURL(String url) {
		// can add if some validations is needed in full implementation
		return true;
	}

	public static String generateKey() {
		String key = "";
		boolean flag = true;
		while (flag) {
			key = "";
			for (int i = 0; i < keySize; i++) {
				key += myChars[random.nextInt(62)];
			}
			if (!Storage.map.containsKey(key)) {
				flag = false;
			}
		}
		return key;
	}

	public static void setupUtilities(int length, String dom) {

		for (int i = 0; i < 62; i++) {
			int j = 0;
			if (i < 10) {
				j = i + 48;
			} else if (i > 9 && i <= 35) {
				j = i + 55;
			} else {
				j = i + 61;
			}
			myChars[i] = (char) j;
		}
		domain = dom;
		keySize = length;
	}

	public static String enhanceUrl(String actaulUrl) {
		if (actaulUrl.substring(0, 7).equals("http://"))
			actaulUrl = actaulUrl.substring(7);

		if (actaulUrl.substring(0, 8).equals("https://"))
			actaulUrl = actaulUrl.substring(8);

		if (actaulUrl.charAt(actaulUrl.length() - 1) == '/')
			actaulUrl = actaulUrl.substring(0, actaulUrl.length() - 1);
		return actaulUrl;
	}
}
