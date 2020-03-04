package lectures.part2oop

object AbstractDataTypes extends App{

  //abstract
  abstract  class Animal{
    val creatureType:String
    def eat : Unit
  }

  class Dog extends Animal{
    override val creatureType: String = "Canine"
    override val eat: Unit = println("crunches")
  }

  //traits
  trait Carnivore{
    def eat(animal: Animal):Unit
  }


  class Crocodile extends Animal with Carnivore{
    override val creatureType: String = "Croc"
    def eat : Unit = println("nomNom")

     def eat(animal: Animal): Unit = println(s"i'm a croc and i'm eating a ${animal.creatureType}")
  }

  //traits vs abstract classes
  // 1 . TRAITS DO NOT HAVE CONSTRUCTOR PARAMETERS
  // 2. Multiple traits can be implemented by the same class
  // 3. Traits shows behavior where as abstract classes are a "thing"



}
