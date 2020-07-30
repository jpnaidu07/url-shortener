package com.interview.us;

import com.interview.us.service.ShortnerService;
import com.interview.us.service.ShortnerServiceImpl;
import com.interview.us.utils.ShorteningUtils;
import com.interview.us.utils.Storage;

/**
 * App for shortnening the urls
 * 
 * @author JayaPrakash
 * 
 * Date 29/7/2020
 *
 */
public class URLShortnerApp {
	

	public static String getShortURL(String url, int keyLength, String domain) {
		ShortnerService s = new ShortnerServiceImpl();
		ShorteningUtils.setupUtilities(keyLength, domain);
		return s.shortenUrl(url);
	}
	
	public static String redirectShortURL(String shortUrl) {
		int length = shortUrl.split("/").length -1;
		String key = shortUrl.split("/")[length];
		if(Storage.map.containsKey(key)) {
			return Storage.map.get(key);
		} else {
			System.out.println("Given Short Url doesnt Exists");
		}
		return null;
	}
	public static void deleteShortURL(String shortUrl) {
		String key = shortUrl.split("/")[shortUrl.split("/").length-1];
		if(Storage.map.containsKey(key)) {
			 Storage.map.remove(key);
			 System.out.println("Given Short Url removed success fully from storage");
		} else {
			System.out.println("Given Short Url doesnt Exists");
		}
	}
}
