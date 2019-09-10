package com.sunshine.jvm.language.basic;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author sunshine
 * @date 2019-09-02
 */
public class ConcurrentHashMapTest {

	@Test
	public void testInitTable() {
		try {
			ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>(30, 0.9f);
			concurrentHashMap.put("1", "1");
			concurrentHashMap.put("2", "2");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
