package lectures.part2oop

object MethodNotations extends App {

  class Person(val name:String,favoriteMovie :String){
    def likes(movie:String):Boolean = movie==favoriteMovie
    def hangoutWith(person :Person): String = s"${this.name} is hanging out with ${person.name}"

  }
  val mary = new Person("Mary","Inception")
  println(mary.likes("Inception"))
  //infix notation = operator notation (Syntactic sugar)

  println(mary likes "Inception")  //equivalent

  //"operators" in scala
  val tom = new Person("Tom","Fight Club")
  println(mary hangoutWith tom)



}
