package com.sunshine.jvm.language.lambda;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

/**
 * 函数式编程接口实验室
 * @author sunshine
 * @created 2019-09-11
 */
public class FunctionalInterfaceLab {

	public void testFunctionalInterfaceLabFirst() {
		Supplier<Integer> integerSupplier = () -> ThreadLocalRandom.current().nextInt();
		System.out.println(integerSupplier.get());
	}

	public void testFunctionalInterfaceLabSecond() {
		Supplier<Integer> integerSupplier = () -> ThreadLocalRandom.current().nextInt();
		System.out.println(integerSupplier.get());
	}
}
