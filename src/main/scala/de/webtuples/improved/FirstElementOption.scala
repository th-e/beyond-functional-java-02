package de.webtuples.improved

object FirstElementOption {
  def main(args: Array[String]): Unit = {

    val ints = List(10, 2, 4)

    // writing list with :: operator
    // Hint: Operators ending in a colon ‘:’ are right-associative. 
    // All other operators are left-associative.
    
    println(firstElement(ints))
  }

  // using pattern matching
  def firstElement(ints: List[Int]): Option[Int] = ???
}