package com.sunshine.jvm.language.junit.condition;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

/**
 * @author yangsonglin
 * @date 2019-07-31 11:55
 */
public class EnvironmentVariableConditionTest {

	@Test
	@EnabledIfEnvironmentVariable(named = "env", matches = "staging")
	void testOnlyOnStagingEnvironment() {
		System.out.println("Test can only run on staging environment");
	}

	@Test
	@DisabledIfEnvironmentVariable(named = "ENV", matches = ".*development.*")
	void testNotOnDevelopmentEnvironment() {
		System.out.println("Test can not run on development environment");
	}
}
