package com.sunshine.service.jvm.language.laboratory.concurrent.task;

/**
 * Sunshine任务，Runnable
 * @author sunshine
 * @date 2019-09-04
 */
public class SunshineRunnableTask implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
			System.out.println("SunshineTask执行成功");
		} catch (Exception e) {
			System.out.println("Sunshine任务执行异常, e:" + e.getMessage());
		}
	}
}
