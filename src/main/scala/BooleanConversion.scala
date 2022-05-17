object BooleanConversion  extends App {
  // Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.
  //  def boolToWord(boolean: Boolean): String = "Yes"



  def boolToWord(boolean: Boolean): String =
    if (boolean) "Yes" else "No"
    println(boolToWord(false))


  // You can have the whole method on one line
  //  def boolToWord(boolean: Boolean): String = if (boolean) "Yes" else "No"
  //  println(boolToWord(false))
}
