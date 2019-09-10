package com.sunshine.jvm.language.reference;

import java.util.Arrays;

/**
 * 方法引用
 * @author sunshine
 * @date 2019-09-04
 */
public class MethodReference {

	public void labFirst() {
		String a = "SUNSHINE";
		Arrays.sort();
		FunctionalInterface functionalInterface = a::toLowerCase;
	}
}
