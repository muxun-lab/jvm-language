package com.sunshine.jvm.language.junit.annotations;

import org.junit.jupiter.api.Test;

/**
 * 标签测试实验室
 * @author yangsonglin
 * @date 2019-07-08 18:05
 */
public class TagTest {

	@Sunshine
	@Test
	void tagTestOne() {
		System.out.println("tag test");
	}

	@SunshineTwo
	void tagTestTwo() {
		System.out.println("tag combine test");
	}
}
