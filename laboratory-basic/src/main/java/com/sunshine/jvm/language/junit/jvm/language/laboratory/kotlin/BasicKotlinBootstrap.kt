package com.sunshine.jvm.language.junit.jvm.language.laboratory.kotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Kotlin启动器
 * @author yangsonglin
 * @date 2019-06-25 21:09
 */
@SpringBootApplication
class BasicKotlinBootstrap {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(BasicKotlinBootstrap::class.java, *args)
        }
    }
}