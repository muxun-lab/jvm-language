package com.sunshine.service.jvm.language.laboratory.concurrent.aqs;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;

/**
 * CyclicBarrier实验室
 * @author sunshine
 * @created 2019-09-10
 */
public class CyclicBarrierLab {

	public void cyclicBarrierLabFirst() throws Exception {
		// 单元测试情况下，不能让主线程中止
		CountDownLatch countDownLatch = new CountDownLatch(1);
		CyclicBarrier cyclicBarrier = new CyclicBarrier(10);
		AtomicLong sum = new AtomicLong();
		for (int i = 0; i < 10; i++) {
			new Thread(() -> {
				try {
					long current = ThreadLocalRandom.current().nextLong(5000);
					Thread.sleep(current);
					sum.addAndGet(current);
					System.out.println(Thread.currentThread().getId() + "=" + current);
					cyclicBarrier.await();
				} catch (InterruptedException | BrokenBarrierException e) {
					e.printStackTrace();
				}
			}).start();
		}
		countDownLatch.await();
		Thread.sleep(15000);
		countDownLatch.countDown();
	}

	public void cyclicBarrierLabSecond() throws Exception {
		CountDownLatch countDownLatch = new CountDownLatch(1);
		AtomicLong sum = new AtomicLong();
		CyclicBarrier cyclicBarrier = new CyclicBarrier(10, () -> {
			try {
				System.out.println(sum.get());
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		for (int i = 0; i < 10; i++) {
			new Thread(() -> {
				try {
					long current = ThreadLocalRandom.current().nextLong(5000);
					Thread.sleep(current);
					sum.addAndGet(current);
					System.out.println(Thread.currentThread().getId() + "=" + current);
					cyclicBarrier.await();
				} catch (InterruptedException | BrokenBarrierException e) {
					e.printStackTrace();
				}
			}).start();
		}
		countDownLatch.await();
		Thread.sleep(15000);
		countDownLatch.countDown();
	}
}
