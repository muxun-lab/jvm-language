package com.sunshine.jvm.language.junit.annotations;

import org.junit.jupiter.api.Tag;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Freestyle注解
 * @author yangsonglin
 * @date 2019-07-08 17:55
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Tag("Sunshine")
public @interface Sunshine {

}
