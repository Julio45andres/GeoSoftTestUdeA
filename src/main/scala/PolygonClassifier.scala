import scala.util.Sorting.quickSort

class PolygonClassifier extends {
  def classify(polygon: Polygon): String = {
    polygon match {
      case Triangle(a, b, c) if a == b && b == c =>
        "Equilateral"
      case Triangle(a, b, c) if a == b || a == c || b == c =>
        "Isosceles"
      case Triangle(_, _, _) =>
        "Scalene"
      case Quadrilateral(a, b, c, d) => {
        val sides: Array[Int] = Array(a, b, c, d)
        quickSort(sides)
        matchQuadrilateral(sides)
      }
      case _ => "Not a triangle or a quadrilateral"
    }
  }

  def matchQuadrilateral(sides: Array[Int]): String = {
    sides match {
      case Array(0, _, _, _) | Array(_ , 0, _, _) | Array(_, _, 0, _) | Array(_, _, _, 0) =>
        "Not a quadrilateral, some side is zero"
      case Array(e, f, g, h) if e == f && f == g && g == h =>
        "Square"
      case Array(e, f, g, h) if e == f && g == h && f != g =>
        "Rectangle"
      case Array(e, f, g, h) if e == f || f == g || g == h =>
        "Trapezoid"
      case Array(_, _, _, _) =>
        "Irregular"
    }
  }
}

// TODO: Interfaz gráfica.
// TODO: Validaciones de lados igual a cero.
// TODO: Validaciones de caracteres.
// TODO: No quemar los objetos de prueba.
