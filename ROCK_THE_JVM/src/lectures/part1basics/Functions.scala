package lectures.part1basics

object Functions extends App {

  def aFunction(a:String, b:Int):String =
    a + " " + b


  def aFunctionWithBlock(a:String, b:Int):String = {
    a + " " + b
  }

  println( aFunction("Hello",3))

  def aParameterLessFunction(): Int = 42
  println(aParameterLessFunction())
  println(aParameterLessFunction)

  def aFactorialRecursionFunction(n:Int):Int={
    if (n >1) {
      n * aFactorialRecursionFunction(n - 1)
    }else{
      1
    }
  }
  println(aFactorialRecursionFunction(3))

  // AUXILARY FUNCTION (FUNCTION INSIDE FUNCTION)
  def aBiggerFunction(a:Int):Int = {
    def aSmallerFunction(c:Int,d:Int):Int = c + d

    aSmallerFunction(a,a)
  }

  def fibonacciSeries(num :Int):Int = {
    if(num<=2)1
    else
      fibonacciSeries(num-1) + fibonacciSeries(num-2)
  }

  println(fibonacciSeries(7))


}
