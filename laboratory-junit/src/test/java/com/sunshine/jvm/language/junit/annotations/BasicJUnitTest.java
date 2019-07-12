package com.sunshine.jvm.language.junit.annotations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * @author yangsonglin
 * @date 2019-07-08 17:42
 */
public class BasicJUnitTest {

	@Test
	void testOne() {
		System.out.println("@Test注解使用");
	}

	@ParameterizedTest
	@ValueSource(ints = {1, 2})
	void testParameterizedTest() {

	}

	@Test
	@DisplayName("DisplayName")
	void testDisplayNameOne() {
		System.out.println("DisplayName annotation");
	}

	@Test
	@DisplayName("🐮🍺")
	void testDisplayNameTwo() {
		System.out.println("DisplayName annotation with Emoji");
	}
}
