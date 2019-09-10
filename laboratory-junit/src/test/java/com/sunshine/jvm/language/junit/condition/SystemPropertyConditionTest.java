package com.sunshine.jvm.language.junit.condition;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

/**
 * @author yangsonglin
 * @date 2019-07-31 11:46
 */
public class SystemPropertyConditionTest {

	@Test
	@EnabledIfSystemProperty(named = "os.arch", matches = ".*64.*")
	void testOnlyOn64BitArchitectures() {
		System.out.println("Test can only run on 64 bit architectures");
	}

	@Test
	@DisabledIfSystemProperty(named = "ci-server", matches = "true")
	void testNotONCiServer() {
		System.out.println("Test can not run on ci server");
	}
}
