package lectures.part2oop

object OOBasics extends App {

  val person = new Person("John",26)
  println(person.age)
  person.greet("Dan")
  person.greet()

  val author = new Writer("Charles","Dickens",1812)
  println(author.fullName())

  val book = new Novel("Great Expectations",1861,author)
  println(book.authorAge)
  println(book.isWrittenBy(author))

}

class Person(name:String,val age:Int){

  def greet(name:String):Unit={
    println(s"${this.name} says hi $name")
  }

  //method overloading
  def greet():Unit={
    println(s"Hey $name")
  }

  //multiple constructor
  def this(name: String) = this(name,0)
}

//CLASS PARAMETERS ARE NOT FIELDS !
class Writer(fName:String,lastName:String,val age:Int){

  def fullName():String = {
    fName + " "+lastName
  }
}

class Novel(name:String,year:Int,author:Writer){
  def authorAge = year - author.age
  def isWrittenBy(author:Writer)=author==this.author
  def copy(newYear:Int):Novel = new Novel(name,newYear,author)
}

class Counter(val count:Int){
  def inc = new Counter(count+1) //immutability
  def dec = new Counter(count-1)

  def inc(n: Int) = new Counter(count + n)
  def dec(n: Int) = new Counter(count - n)
}





