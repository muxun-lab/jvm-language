package com.sunshine.service.jvm.language.laboratory.concurrent.task;

import com.google.common.util.concurrent.ListenableFutureTask;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * ListenableFutureTask实验室
 * @author sunshine
 * @date 2019-09-04
 */
public class ListenableFutureTaskLab {

	/**
	 * 测试线程池一
	 */
	private ThreadPoolExecutor listenableFutureTaskExecutor = new ThreadPoolExecutor(5, 10, 5, TimeUnit.MINUTES, new ArrayBlockingQueue<>(10));
	/**
	 * 测试线程池二
	 */
	private ThreadPoolExecutor listenableFutureTaskExecutorTwo = new ThreadPoolExecutor(5, 10, 5, TimeUnit.MINUTES, new ArrayBlockingQueue<>(10));

	/**
	 * 添加监听线程实验室
	 */
	public void lab() throws Exception {
		ListenableFutureTask listenableFutureTask = ListenableFutureTask.create(new SunshineCallableTask());
		listenableFutureTask.addListener(new ListenerOne(), listenableFutureTaskExecutor);
		listenableFutureTask.addListener(new ListenerTwo(), listenableFutureTaskExecutorTwo);
		listenableFutureTaskExecutor.submit(listenableFutureTask);
		System.out.println(listenableFutureTask.get());
	}

	/**
	 * 带返回结果的实验室
	 */
	public void labSecond() throws Exception {
		ListenableFutureTask<String> listenableFutureTask = ListenableFutureTask.create(new SunshineRunnableTask(), "success");
		listenableFutureTask.addListener(new ListenerOne(), listenableFutureTaskExecutor);
		listenableFutureTask.addListener(new ListenerTwo(), listenableFutureTaskExecutorTwo);
		listenableFutureTaskExecutor.submit(listenableFutureTask);
		System.out.println(listenableFutureTask.get());
	}

	/**
	 * 监听线程一
	 */
	class ListenerOne implements Runnable {

		@Override
		public void run() {
			System.out.println("我是监听线程一");
		}
	}

	/**
	 * 监听线程二
	 */
	class ListenerTwo implements Runnable {

		@Override
		public void run() {
			System.out.println("我是监听线程二");
		}
	}
}
