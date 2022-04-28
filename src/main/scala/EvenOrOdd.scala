object EvenOrOdd extends App {

  // Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
  // object Sol {
  //
  //  def evenOrOdd(number: Int): String = {
  //    // your code here
  //    ""
  //  }
  //}

  def evenOrOdd(number: Int): String = {
    // Modulus Operator %
    if (number%2 == 0) "Even" else "Odd"
  }
  println(evenOrOdd(7))


}
