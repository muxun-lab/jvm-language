package com.sunshine.service.jvm.language.laboratory.concurrent.aqs;

/**
 * @author sunshine
 * @created 2019-09-11
 */
public class ThreadLocalLab {

	public void threadLocalLabFirst() {
		ThreadLocal threadLocal = new ThreadLocal();
		// 空指针，因为ThreadLocal中默认初始化的变量是null
		System.out.println(threadLocal.get().toString());
	}

	public void threadLocalLabSecond() {
		ThreadLocal threadLocal = new ThreadLocal();
		threadLocal.set("Sunshine");
		System.out.println(threadLocal.get().toString());
	}
}
