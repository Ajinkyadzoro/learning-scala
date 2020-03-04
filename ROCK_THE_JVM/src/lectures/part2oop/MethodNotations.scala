package lectures.part2oop

object MethodNotations extends App {

  class Person(val name:String,favoriteMovie :String){
    def likes(movie:String):Boolean = movie==favoriteMovie
    def hangoutWith(person :Person): String = s"${this.name} is hanging out with ${person.name}"
    def apply(): String = s"Hi my name is $name and i like $favoriteMovie"
  }
  val mary = new Person("Mary","Inception")
  println(mary.likes("Inception"))
  //infix notation = operator notation (Syntactic sugar)

  println(mary likes "Inception")  //equivalent

  //"operators" in scala
  val tom = new Person("Tom","Fight Club")
  println(mary hangoutWith tom)
  println(mary())
  //apply method called



}
