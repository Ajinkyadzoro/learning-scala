package lectures.part1basics

object Expressions extends App {

  val x = 1+2 //EXPRESSION
  println(x)
  println(2+3*4)

  // + - * / & | ^ << >> >>>(right shift with 0 extension)
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println("HI "+aConditionedValue)

  var i =0
  while(i<10){
    println(i)
    i += 1
  }
  //EVERYTHING IN SCALA IS AN EXPRESSION !
  // DO NOT USE LOOPS
var aVariable = 0
  val aWeirdValue = aVariable=3

  //above expression return unit
  println(aWeirdValue)

  //codeblocks
  //codeblock is an expression
  //codeblock returns value as its last statement
  // codeblocks variables are limited by its scope.
  val codeBlock = {
    val y = 2
    val z = y+1
    if(z>y) "Hello" else "GoodBye"
  }
  print(codeBlock)

}
