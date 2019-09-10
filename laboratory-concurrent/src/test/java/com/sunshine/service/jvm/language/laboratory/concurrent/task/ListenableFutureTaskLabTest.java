package com.sunshine.service.jvm.language.laboratory.concurrent.task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @date 2019-09-04
 */
@DisplayName("ListenableFutureTask实验室测试")
public class ListenableFutureTaskLabTest {

	private ListenableFutureTaskLab listenableFutureTaskLab;

	@BeforeEach
	public void init() {
		this.listenableFutureTaskLab = new ListenableFutureTaskLab();
	}

	@Test
	public void testFirst() throws Exception {
		this.listenableFutureTaskLab.lab();
	}

	@Test
	public void testSecond() throws Exception {
		this.listenableFutureTaskLab.labSecond();
	}

	@Test
	public void testThird() {
		String a = "a";
		String b = "";
		if (a != null) {
			a = null;
		} else if (b != null) {
			System.out.println(a);
		}
	}
}
