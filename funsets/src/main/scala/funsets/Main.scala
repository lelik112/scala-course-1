package funsets

object Main extends App {
  import FunSets._
//  println(contains(singletonSet(1), 1))

  val set1: Int => Boolean = x => x == 1 | x == 3 | x == 4 | x == 5 | x == 7 | x == 1000
  val predicat: Int => Boolean = x => x < 0
  FunSets.printSet(FunSets.diff(set1, predicat))
  println(FunSets.forall(set1, FunSets.diff(set1, predicat)))

}
