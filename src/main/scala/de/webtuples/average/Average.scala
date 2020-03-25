package de.webtuples.average
import cats.data.NonEmptyList

object Average {

  def main(args: Array[String]): Unit = {
    val ints = List()
    println(average1(ints))
  }

  def average1(xs: List[Int]): Double = ???
  def average2(xs: List[Int]): Option[Double] = ???
  def average3(ints: NonEmptyList[Int]): Double = ???
}
