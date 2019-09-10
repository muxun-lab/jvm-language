package com.sunshine.service.jvm.language.laboratory.concurrent.aqs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * CyclicBarrier测试实验室
 * @author sunshine
 * @created 2019-09-10
 */
@DisplayName("CyclicBarrier测试实验室")
public class CyclicBarrierLabTest {

	@Test
	public void testCyclicBarrierLabFirst() throws Exception {
		new CyclicBarrierLab().cyclicBarrierLabFirst();
	}

	@Test
	public void testCyclicBarrierLabSecond() throws Exception {
		new CyclicBarrierLab().cyclicBarrierLabSecond();
	}
}
