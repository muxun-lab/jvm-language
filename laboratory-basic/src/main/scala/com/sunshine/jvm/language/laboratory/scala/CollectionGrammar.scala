package com.sunshine.jvm.language.laboratory.scala

object CollectionGrammar extends App {

  // 数组
  val numbers = Array(1, 2, 2, 3)
  println(numbers(3))
  println(numbers)
  numbers(3) = 4
  println(numbers(3))

  // 列表
  var numberList = List(1, 2, 2, 3)
  println(numberList.size)
  println(numberList(2))
  //  numberList(2) = 4
  println(numberList(2))

  // Set
  val numberSet = Set(1, 2, 3, 4, 5, 5)
  println(numberSet.size)

  // Tuple
  val hostPort = ("localhost", 8080)
  println(hostPort._1)
  println(hostPort._2)
  // 创建两个元素的特殊Tuple
  println(1 -> 2)

  // 映射Map
  Map(1 -> 2)
  Map("foo" -> "bar")
  var map = Map(1 -> 2, 3 -> 4, "Sunshine" -> "Scala")
  println(map.get("Sunshine"))
  map += (5 -> 6)
  println(map(5))
  var map2 = Map((1, 2), (3, 4))
  println(map.get(1))

  // Option
  println(map.get(7).isDefined)

  // 函数组合子
  var list2 = List(1, 2, 3) map (x => x * x)
  println(list2(1))

  // map
  list2 = list2.map(x => x * x)
  println(list2(1))

  def squared(i: Int) = {
    i * i
  }

  list2 = list2.map(squared)
  println(list2(1))

  // foreach
  list2.foreach(i => i * 2)

  // filter
  // filter移除任何对传入函数计算结果为false
  list2 = list2.filter(i => i % 2 == 0)
  println(list2.size)

  def isOld(i: Int) = {
    i % 2 == 0
  }

  list2 = list2.filter(isOld)
  println(list2.size)

  // zip
  // zip是将两个列表的内容聚合到一个对偶列表中
  var list3 = List(1, 2, 3).zip(List("a", "b", "c"))
  list3.foreach(x => println(x))

  // partition
  // 使用给定的谓词函数分割列表
  val list4 = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  var (a, b) = list4.partition(_ % 2 == 0)
  println(a.foreach(print))
  println(b.foreach(print))

  // drop dropWhile
  // drop：删除前i个元素
  // drop：删除匹配谓词函数的第一个元素
  var list5 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  list5 = list5.drop(5)
  list5.foreach(print)
  println()
  list5 = list5.dropWhile(_ % 2 != 0)
  // 7被6保护了，所以list没有发生变化
  list5.foreach(print)
  println()

  // find
  println(list5.find(i => i > 7))

  // foldLeft
  // 累加器，从左往右进行累加
  // foldRight
  // 累加器，从右往左进行累加
  list5.foldLeft(0) { (m: Int, n: Int) => println((m, n)); m + n }
  list5.foldRight(9) { (m: Int, n: Int) => println((m, n)); m + n }

  // flatten
  // 将嵌套结构扁平化
  List(List(1, 2), List(3, 4)).flatten.foreach(println)

  // flatMap
  // 是组合子，结合mapping、flattening
  val list6 = List(List(1, 2), List(3, 4))
  list6.flatMap(x => x.map(_ * 2))

  // 扩展函数组合子
  def ourMap(numbers: List[Int], fn: Int => Int): List[Int] = {
    numbers.foldRight(List[Int]()) {
      (x: Int, xs: List[Int]) =>
        fn(x) :: xs
    }
  }

  // Map
  var extensions = Map("steve" -> 100, "bob" -> 101, "joe" -> 201)
  extensions.filter((namePhone: (String, Int)) => namePhone._2 < 200).foreach(println)

  extensions.filter({ case (name, phone) => phone < 101 }).foreach(println)
}
