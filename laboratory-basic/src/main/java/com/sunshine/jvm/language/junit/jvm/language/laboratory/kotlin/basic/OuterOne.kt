package com.sunshine.jvm.language.junit.jvm.language.laboratory.kotlin.basic

/**
 * 嵌套
 * @author yangsonglin
 * @date 2019-07-05 19:09
 */
class OuterOne {

    private val bar: Int = 1

    class Nested {
        fun foo() = 2
    }
}

val demoOne = OuterOne.Nested().foo()

/**
 * 内部类
 */
class OuterTwo() {

    private val bar: Int = 1

    inner class Inner {
        fun foo() = 2
    }
}

var demoTwo = OuterTwo().Inner().foo()

/**
 * 匿名内部类
 */
class OuterThree() {

}
