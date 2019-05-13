package com.sunshine.jvm.language.laboratory.scala

object BasicGrammar extends App {
  val a = 1
//  错误示例
//  a = 2
//  var b = 1
//  println(b)
//  b = 2
//  println(b)
//
//  // 匿名函数
//  (x: Int) => x + 1
//  val addOne = (x: Int) => x + 1
//
//  def multi(a: Int, b: Int): Int = {
//    a * b
//  }
//
//  {
//    (a: Int, b: Int) =>
//      a * b
//  }
  // 部分应用
  def add(a: Int, b: Int) = a + b

  val add2 = add(1, _)

  println(add2(3))

  // 柯里化函数
  def multiOne(a: Int)(b: Int) = {
    a * b
  }
  println(multiOne(2)(3))
  var multiConst = multiOne(2)_
  println(multiConst(3))

  // 可变长度参数，传入多个String参数
  def capitalizeAll(args: String*) = {
    args.map {
      arg => arg.capitalize
    }
  }

  class Calculator(brand: String) {

    val color: String = if (brand == "Ti") {
      "blue"
    } else if (brand == "HP") {
      "black"
    } else {
      "white"
    }

    def addTwo(a: Int, b: Int) = a + b
  }

  val calculator = new Calculator("Ti")
  println(calculator.color)

  class ScientificCalculator(brand: String) extends Calculator(brand) {
    def log(m: Double, base: Double) = math.log(m) / math.log(base)
  }

  class EvenMoreScientificCalculator(brand: String) extends ScientificCalculator(brand) {
    def log(m :Int): Double = log(m, math.exp(1))
  }

  // 抽象类
  abstract class Shape {
    def getArea: Int
  }

  class Circle(r: Int) extends Shape {
    def getArea: Int = {
      r * r * 3
    }
  }

  val circle = new Circle(2)
  println(circle.getArea)

  // 特质
  trait Car {
    val brand: String
  }
  trait Shiny {
    val shineRefraction: Int
  }
  class BMW extends Car with Shiny {
    val brand = "BMW"
    val shineRefraction: Int = 1
  }

  // 类型
  trait Cache[K, V] {
    def get(key: K): V
    def put(key: K, value: V)
    def delete(key: K)
  }

  // apply方法
  class Foo() {

  }

  object FooMaker {
    def apply() = new Foo
  }

  val newFoo = FooMaker()

  // 单例
  object Timer {
    var count = 0

    def currentCount(): Long = {
      count += 1
      count
    }
  }
  println(Timer.currentCount())

  // 函数即对象
  object addOne extends (Int => Int) {
    def apply(v1: Int): Int = v1 + 1
  }

  println(addOne(1))

  class AddOne extends (Int => Int) {
    def apply(v1: Int) = v1 + 1
  }

  println(colorHolder.BLUE)

  // 模式匹配
  val times = 1
  times match {
    case 1 => "one"
    case 2 => "two"
    case _ => "> 2"
  }

  // 匹配类型
  def bigger(o: Any): Any = {
    o match {
      case i: Int if i < 0 => i - 1
      case i: Int => i + 1
      case d: Double if d < 0.0 => d - 0.1
      case text: String => text + "s"
    }
  }

  // 匹配类成员
  def calcType(calc: CalculatorTwo) = calc match {
    case _ if calc.brand == "HP" && calc.model == "20B" => "financial"
    case _ if calc.brand == "HP" && calc.model == "48G" => "scientific"
    case _ if calc.brand == "HP" && calc.model == "30B" => "business"
    case _ => "unknown"
  }

  // 样本类Case Classes
  case class CalculatorTwo(brand: String, model: String)

  val calculatorTwo = CalculatorTwo("HP", "20b")
  val calculatorThree = CalculatorTwo("HP", "20b")
  println(calculatorTwo == calculatorThree)

  def calcTypeOne(calc: CalculatorTwo) = calc match {
    case CalculatorTwo("HP", "20B") => "financial"
    case CalculatorTwo("HP", "48G") => "scientific"
    case CalculatorTwo("HP", "30B") => "business"
    case CalculatorTwo(_, _) => "unknown type"
  }

  try {
    println("Exception")
  } catch {
    case e: NullPointerException => println("NullPointerException")
    case e: ArrayIndexOutOfBoundsException => println("ArrayIndexOutOfBoundsException")
  }

  val result: Int = try {
    println("statement try block")
    0
  } catch {
    case e: NullPointerException => 1
    case e: ArrayIndexOutOfBoundsException => 2
  }
}

object colorHolder {
  val BLUE = "Blue"
  val RED = "red"
}


