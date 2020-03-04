package lectures.part2oop

object Objects extends App {

  //SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("STATIC")
  // SCALA HAS SOMETHING EVEN BETTER AND THAT IS CLASSES

  object Person{
    val N_EYES = 2
    def canFly: Boolean = false

    //THIS IS A FACTORY METHOD := FACTORY METHOD MEANS WE WILL USE THIS METHOD WHICH IS DECLARED INSIDE OF
    // AN OBJECT AND THIS METHOD WILL BE USED BY AN INSTANCE OF A CLASS HAVING SAME NAME AS OBJECT.

    def apply(motherClass:Person,fatheClass:Person): Person = new Person("Bobbie")
  }

  class Person(val name :String){

  }

  //When you create objects and classes of same name they are called as companions..!!
  println(Person.N_EYES)

  //OBJECTS IN SCALA ARE SIMILAR TO CLASSES HOWEVER THEY DO NOT RECEIVE PARAMETERS.

  //SCALA OBJECTS IS A SINGLETON INSTANCE
  val mary = new Person("Marry")
  val john = new Person("John")

  val bobbie = Person(mary,john)
  println(bobbie.name)

  println(mary==john)


}
