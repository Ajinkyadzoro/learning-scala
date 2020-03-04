package lectures.part2oop

object InheritanceAndTraits extends App {

  class Animal{
    def eat() = println("NomNom")
    val creatureType ="wild"
  }
  class Cat extends Animal{

  }
  val cat = new Cat
  cat.eat()


  class Person(name:String,age:Int){

  }
  class Adult(name:String,age:Int,idCard:String) extends Person(name,age)

  class Dog extends Animal{
    override def eat(): Unit = println("Dog is eating")

    override val creatureType: String = "DOMESTIC"
  }

  val dog = new Dog
  dog.eat()
  println(dog.creatureType)

  //type substitution (polymorphism)
  val unknownAnimal:Animal = new Dog

  // IF YOU WANT TO PROTECT METHODS FROM OVERLOADING THEN USE
  // 1. FINAL KEYWORD ON MEMBERS
  // 2. FINAL KEYWORD ON CLASSES
  // 3. SEALED KEYWORD //BASICALLY SEALED KEYWORD PREVENTS OTHER FILES IN PACKAGE TO USE THE CLASS.
}
