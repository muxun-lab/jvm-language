package com.sunshine.jvm.language.junit.jvm.language.laboratory.kotlin.basic

/**
 * when语法
 * @author yangsonglin
 * @date 2019-06-28 11:44
 */
object WhenGrammar {

    /**
     * 多条件
     */
    fun whenSecond(obj: Any) {
        when (obj) {
            0, 1 -> println("obj is 0 or 1")
            else -> println("other")
        }
    }

    /**
     * 任意表达式
     */
    fun whenThird(obj: Any) {
        when (obj) {
            obj is Int -> println("obj is a number")
            else -> println("other")
        }
    }

    /**
     * 范围表达式
     */
    fun whenForth(obj: Any) {
        when (obj) {
            in 0..10 -> println("obj is in range 0~10")
            !in 15..20 -> println("obj is not in range 15~20")
        }
    }
}