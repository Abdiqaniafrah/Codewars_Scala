object ReversedString extends App {
  //  Complete the solution so that it reverses the string passed into it.
  //  'world'  =>  'dlrow'
  //  'word'   =>  'drow'
  //  object Kata {
  //    def solution(word: String): String = {


  def solution(word: String): String =
    (for(i <- word.length -1 to(0) by(-1))yield word(i))mkString()
  println(solution("Abdiqani"))

}


