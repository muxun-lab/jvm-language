package com.sunshine.jvm.language.junit.jvm.language.laboratory.kotlin.basic

import com.sunshine.jvm.language.junit.jvm.language.laboratory.kotlin.domain.Competitor
import com.sunshine.jvm.language.junit.jvm.language.laboratory.kotlin.domain.UserDTO
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths

/**
 *
 * @author yangsonglin
 * @date 2019-06-26 16:53
 */
object BasicGrammar {
    var a = 1

    var stringOne = "a = $a"

    var stringTwo = "${stringOne.replace("is", "was")}, but now is $a"

    var price = """
        ${'$'}666.66
        """.trimIndent()

    fun maxOf(a: Int, b: Int): Int {
        return if (a > b) {
            a
        } else {
            b
        }
    }

    private val items = listOf("Uzi", "Ming", "Karsa", "LangX", "XiaoHu")

    fun maxOfTwo(a: Int, b: Int): Int = if (a > b) a else b

    /**
     * foreach循环
     */
    fun loopOne() {
        for (item in items) {
            println(item)
        }
    }

    /**
     * for游标循环
     */
    fun loopTwo() {
        for (index in items.indices) {
            println("item at $index is ${items[index]}")
        }
    }

    /**
     * while游标循环
     */
    fun whileLoop() {
        var index = 0
        while (index < items.size) {
            println("item at $index is ${items[index]}")
            index++
        }
    }

    /**
     * when表达式
     */
    fun judge(obj: Any): String =
            when (obj) {
                1 -> "RNG"
                "ADC" -> "Uzi"
                !is String -> "Not a String"
                else -> "Unknown"
            }

    /**
     * Range
     * 用in可以判断一个数字是否在另一个数字的范围内
     */
    fun rangeOne() {
        val x = 10
        val y = 9
        if (x in 1..y + 1) {
            println("x is in y")
        }
    }

    /**
     * Range
     * 用in判断一个数字是否超出范围
     */
    fun rangeTwo() {
        val list = listOf<String>("Uzi", "Ming", "Karsa", "LangX", "XiaoHu")

        if ("able" !in list) {
            println("able is not in RNG")
        }

        if (-1 !in 0..list.lastIndex) {
            println("-1 is out of range")
        }

        if (list.size !in list.indices) {
            println("list size is out of valid indices range, too")
        }
    }

    /**
     * Range
     * 遍历一个range
     */
    fun rangeThree() {
        for (x in 0..5) {
            println(x)
        }
    }

    /**
     * Range
     * 可以使用进度进行跳跃
     */
    fun rangeFour() {
        for (x in 1..10 step 2) {
            println(x)
        }
    }

    /**
     * Range
     * 可以使用集合
     */
    fun rangeFive() {
        for (item in items) {
            println(item)
        }
    }

    /**
     * 集合
     * 可以判断元素是否在集合中
     */
    fun collectionOne(): String =
            when {
                "Able" in items -> "Able is ADC"
                "Uzi" in items -> "Uzi is ADC"
                else -> "There is no ADC"
            }

    /**
     * 集合
     * 可以使用filter、map等函数操作集合
     */
    fun collectionTwo() {
        items.filter { it.startsWith("U") }
                .sortedBy { it }
                .map { it.toUpperCase() }
                .forEach { println(it) }
    }

    /**
     * 数据元类的使用
     */
    var user = UserDTO(1, "Sunshine", "Pegasus")

    var competitorOne: Competitor = Competitor()


    /**
     * 函数参数的默认值
     */
    fun functionOne(competitor: String = "Uzi") {
        println("the default value of the parameter which belongs to function")
    }

    /**
     * filter
     */
    fun filterOne() {
        items.filter { x -> x.startsWith("U") }
        items.filter { it.startsWith("U") }
    }

    /**
     * Range的多样用法
     */
    fun rangeSix() {
        for (i in 1..100) {

        }

        for (i in 1 until 100) {

        }

        for (i in 1..10 step 2) {

        }

        for (i in 10 downTo 1) {

        }
    }

    /**
     * 集合
     * 不可变集合
     */
    fun collectionThree() {
        val list = listOf<String>("Uzi", "Ming", "Karsa", "LangX", "XiaoHu")
        val map = mapOf<String, String>("ADC" to "Uzi", "Jungle" to "Karsa")

        println(map["ADC"])
    }

    /**
     * 懒属性
     */
    val lazyOne: String by lazy {
        "Sunshine"
    }

    /**
     * 单例
     */
    object Singleton {
        val singleton = "1"
    }

    /**
     * 在不为null的情况下输出
     */
    fun notNullOne() {
        val files = File("Test").listFiles()
        println(files?.size)
    }

    /**
     * 为null时的操作
     */
    fun nullOne() {
        val str = "Sunshine"
        str ?: throw IllegalAccessException("str can not be null")
    }

    /**
     * try catch
     */
    fun tryCatch() {
        val result = try {

        } catch (e: ArithmeticException) {
            throw IllegalStateException(e)
        }
    }

    /**
     * if表达式
     */
    fun ifOne(param: Int) {
        val result = if (param == 1) {
            "Uzi"
        } else if (param == 2) {
            "Ming"
        } else {
            "Karsa"
        }
    }

    /**
     * 单表达式函数
     */
    fun singleExpressionOne() = "Sunshine"

    /**
     * when表达式
     */
    fun whenOne(competitor: String): String = when (competitor) {
        "Uzi" -> "ADC"
        "Ming" -> "Support"
        "Karsa" -> "Jungle"
        else -> "Other"
    }

    fun tryWithResourcesFirst() {
        val stream = Files.newInputStream(Paths.get(""))
        stream.buffered().reader().use { reader ->
            println(reader.readText())
        }
    }

    /**
     * 数值调换
     */
    fun reverse() {
        var a = 1
        var b = 2
        a = b.also { b = a }
    }

    /**
     * when
     * 多条件
     */
    fun whenSecond() {

    }
}
