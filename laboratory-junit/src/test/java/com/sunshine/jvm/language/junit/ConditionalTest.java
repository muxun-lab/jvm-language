package com.sunshine.jvm.language.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author yangsonglin
 * @date 2019-07-29 20:01
 */
public class ConditionalTest {

	@Test
	@EnabledOnOs(OS.MAC)
	void testOnlyOnMacOS() {
		System.out.println("Test only on macOS");
	}

	@TestOnMac
	void testOnlyOnMacOSCustomize() {
		System.out.println("Test only on macOS customize");
	}

	@Test
	@EnabledOnOs({OS.LINUX, OS.MAC})
	void testOnLinuxOrMacOS() {
		System.out.println("Test only on either Linux or macOS");
	}

	@Test
	@EnabledOnOs(OS.WINDOWS)
	void testOnWindows() {
		System.out.println("Test only on Windows");
	}

	@Test
	@DisabledOnOs(OS.WINDOWS)
	void testDisabledOnWindows() {
		System.out.println("Test disabled on windows");
	}

	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	@Test
	@EnabledOnOs(OS.MAC)
	@interface TestOnMac {

	}
}
