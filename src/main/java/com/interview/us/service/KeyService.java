package com.interview.us.service;

/**
 * This interface contains method to generate random keys for tiny url
 */

public interface KeyService {
	
	public String getRandomKey(String actualUrl);

}
