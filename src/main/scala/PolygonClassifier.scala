class PolygonClassifier extends {
  def classify(polygon: Polygon): String = {
    polygon match {
      case Triangle(a, b, c) if a == b && b == c =>
        "Equilateral"
      case Triangle(a, b, c) if a == b || a == c || b == c =>
        "Isosceles"
      case Triangle(_, _, _) =>
        "Scalene"
      case Quadrilateral(a, b, c, d) if a == b && b == c && c == d =>
        "Square"
      case Quadrilateral(a, b, c, d) if a == c && b == d =>
        "Rectangle"
      case Quadrilateral(a, b, c, d) if (a != c && b == d) || (a == c && b != d) =>
        "Trapezoid"
      case Quadrilateral(_, _ , _ ,_) =>
        "Irregular or trapezium"
    }
  }
}
