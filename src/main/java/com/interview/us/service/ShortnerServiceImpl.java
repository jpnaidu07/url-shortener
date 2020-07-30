package com.interview.us.service;

import com.interview.us.utils.ShorteningUtils;
import com.interview.us.utils.Storage;

public class ShortnerServiceImpl implements ShortnerService
{

	public String shortenUrl(String actualUrl) {
		KeyService keyService = new KeyServiceImpl();
		String shortenedURL = "";
		if (ShorteningUtils.evURL(actualUrl)) {
			actualUrl = ShorteningUtils.enhanceUrl(actualUrl);
			if (Storage.suMap.containsKey(actualUrl) 
					&& Storage.suMap.get(actualUrl)!=null && !Storage.suMap.get(actualUrl).equals("")) {
				shortenedURL = ShorteningUtils.domain + "/" + Storage.suMap.get(actualUrl);
			} else {
				shortenedURL = ShorteningUtils.domain + "/" + keyService.getRandomKey(actualUrl);
			}
		}
		return shortenedURL;
	}
   
}