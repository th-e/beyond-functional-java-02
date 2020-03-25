package de.webtuples

object FirstElement {
  def main(args: Array[String]): Unit = {
    val ints = List(10, 2, 4)
    println(firstElement(ints))
  }

  def firstElement(ints: List[Int]) : Int = ints(0)
}

