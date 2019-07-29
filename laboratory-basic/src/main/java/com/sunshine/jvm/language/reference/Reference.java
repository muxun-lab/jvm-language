package com.sunshine.jvm.language.reference;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author yangsonglin
 * @date 2019-07-22 16:13
 */
public class Reference {

	private static AtomicInteger atomicInteger = new AtomicInteger(0);

	public static void main(String[] args) {
		for (int i = 0; i < 2000; i++) {
			try {
				//会被GC
				new Person(atomicInteger.getAndIncrement()).beSmart(20);
				//下面这种写法，person不会被gc掉
				// Person person = new Person(atomicInteger.getAndIncrement());
				// person.beSmart(20);
				//这种写法会被GC
				//personSmart();
			} catch (NullPointerException e) {
				e.printStackTrace();
				break;
			}
		}
	}
}

class Person {

	private int id;
	private Head head;

	Person(int i) {
		this.id = i;
		this.head = new Head(i);
	}

	public void beSmart(int iq) {
		this.head.beSmart(iq);
	}

	@Override
	public void finalize() {
		System.out.println(id + " Person.finalize()....");
	}
}

class Head {

	private int id;
	HeadCell headCell;

	Head(int i) {
		this.id = i;
		this.headCell = new HeadCell();
	}

	public int beSmart(int iq) {
		System.gc();
		System.runFinalization();
		return this.headCell.beSmart(iq);
	}

	public void clearHeadCell() {
		this.headCell = null;
	}

	@Override
	public void finalize() {
		System.out.println(id + " Head.finalize()....");
	}
}

class HeadCell {
	int curIq;

	public int beSmart(int iq) {
		this.curIq += iq;
		return this.curIq;
	}

}
