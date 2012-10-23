package tp

import annotation.tailrec

object Functions {

  def fibonacciRec(n: Int): Int = n match {
    case 0 | 1 => 1
    case _ => fibonacciRec(n - 1) + fibonacciRec(n - 2)
  }
  def fibonacci(n: Int): Int = 3

  def show(f: Int => Int, xs: Int*): Unit = 3

}
