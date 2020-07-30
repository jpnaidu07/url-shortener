package com.interview.us.service;

import com.interview.us.utils.ShorteningUtils;
import com.interview.us.utils.Storage;


public class KeyServiceImpl implements KeyService {

	public String getRandomKey(String actualUrl) {
		String key;
		key = ShorteningUtils.generateKey();
		Storage.map.put(key, actualUrl);
		Storage.suMap.put(actualUrl, key);
		return key;
	}

	
}
