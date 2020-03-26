package de.webtuples.forcomprehension
//example from danielwestheide

case class User(
  id: Int, 
  firstName: String,
  lastName: String, 
  age: Int,
  gender: Option[String])

object UserRepository {
  private val users = Map(1 -> User(1, "John", "Doe", 32, Some("male")),
                          2 -> User(2, "Johanna", "Doe", 30, None))
  def findById(id: Int): Option[User] = users.get(id)
  def findAll = users.values

  def main(args: Array[String]): Unit = {
    
    val age = UserRepository.findById(1).map(_.age) 
    val gender = UserRepository.findById(1).map(_.gender) 

    val gender2 = for {
      user <- UserRepository.findById(1)
      gender <- user.gender
    } yield gender 

    println(age)
    println(gender)
    println(gender2)
  }
}



