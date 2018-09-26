case class Triangle(a: Int, b: Int, c:Int)

val tr = Triangle(4, 5, 5)

object triangleClassifier{
  def classify(triangle: Triangle): String = triangle match {
    case Triangle(a, b, c) if a == b && a == c =>
      "Equilater"
    case Triangle(a, b, c) if a == b || a == c || b == c =>
      "Isosceles"
    case _ => "Scalene"
  }
}

class main{
  def main(args: Array[String]): Unit = {
    println(triangleClassifier classify tr)
  }
}