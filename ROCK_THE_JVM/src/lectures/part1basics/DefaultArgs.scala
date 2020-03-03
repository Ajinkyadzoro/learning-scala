package lectures.part1basics

object DefaultArgs extends App {


  def trFact(n: Int , acc: Int= 1): Int = {
    if (n <=1) acc
    else trFact(n-1,n*acc)
  }
  def reducer(x:Int):Int ={
    if (x==0)x
    else
    x+reducer(x-1)
  }
  println(reducer(5))

  val someList = (0 to 20).toList
  def mod3(aList:List[Int]):Unit={
    println(aList.filter(x=>x%3==0))
  }
mod3(someList)
}
