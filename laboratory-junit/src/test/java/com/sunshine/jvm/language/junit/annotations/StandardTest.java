package com.sunshine.jvm.language.junit.annotations;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * @author yangsonglin
 * @date 2019-07-09 15:16
 */
public class StandardTest {

	@BeforeAll
	static void initAll() {
		System.out.println("BeforeAll annotation");
	}

	@BeforeEach
	void init() {
		System.out.println("BeforeEach annotation");
	}

	@Test
	void testSuccess() {
		System.out.println("Succeed");
	}

	@Test
	void testFailed() {
		System.out.println("Fail");
	}

	@Test
	@Disabled("Expired")
	void testDisabled() {
		System.out.println("Disable");
	}

	@AfterEach
	void destroy() {
		System.out.println("AfterEach annotation");
	}

	@AfterAll
	static void destroyAll() {
		System.out.println("AfterAll annotation");
	}
}
