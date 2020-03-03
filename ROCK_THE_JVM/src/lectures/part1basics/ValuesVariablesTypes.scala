package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x: Int = 42
  println(x)
  val y = 30
  //COMPILER CAN INFER TYPES

  val aString:String = "Hello"

  //semicolons are optional

  val aBoolean: Boolean = false
  val aChar : Char = 'a'
  val aShort: Short = 10
  //Short = 2bytes
  val aLong: Long = 4567891L
  // Long 8bytes
  val aFloat: Float = 2.14f
  val aDouble: Double = 3.14

  //---------------------------------------------VARIABLES---------------------------------------------

  var aVariable: Int = 4
  aVariable = 5
}
