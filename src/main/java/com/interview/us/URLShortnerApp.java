package com.interview.us;

import com.interview.us.service.ShortnerService;
import com.interview.us.service.ShortnerServiceImpl;
import com.interview.us.utils.ShorteningUtils;

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
}
