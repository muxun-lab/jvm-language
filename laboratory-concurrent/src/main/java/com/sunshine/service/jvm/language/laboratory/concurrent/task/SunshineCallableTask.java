package com.sunshine.service.jvm.language.laboratory.concurrent.task;

import java.util.concurrent.Callable;

/**
 * Sunshine任务，Callable类型
 * @author sunshine
 * @date 2019-09-04
 */
public class SunshineCallableTask implements Callable<String> {

	public SunshineCallableTask() {

	}

	@Override
	public String call() throws Exception {
		try {
			Thread.sleep(5000);
			System.out.println("SunshineTask执行成功");
			return "success";
		} catch (Exception e) {
			System.out.println("Sunshine任务执行异常, e:" + e.getMessage());
			return "failed";
		}
	}

	@Override
	public String toString() {
		return "SunshineTask{}";
	}
}
