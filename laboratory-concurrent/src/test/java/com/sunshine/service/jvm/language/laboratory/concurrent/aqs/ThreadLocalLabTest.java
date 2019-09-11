package com.sunshine.service.jvm.language.laboratory.concurrent.aqs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2019-09-11
 */
@DisplayName("ThreadLocal测试实验室")
public class ThreadLocalLabTest {

	@Test
	public void testThreadLocalLabFirst() {
		new ThreadLocalLab().threadLocalLabFirst();
	}

	@Test
	public void testThreadLocalLabSecond() {
		new ThreadLocalLab().threadLocalLabSecond();
	}
}
