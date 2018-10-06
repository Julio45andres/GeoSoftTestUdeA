package com.udea.julianmunozm.polygons

class PolygonClassifier {
  def classify(polygon: Polygon): PolygonType = {
    polygon match {
      case Triangle(a, b, c) if a == 0 || b == 0 || c == 0 => NotATriangle
      case Triangle(a, b, c) if a == b && b == c => EquilateralTriangle
      case Triangle(a, b, c) if a == b || b == c || c == a => IsoscelesTriangle
      case Triangle(a, b, c) => ScaleneTriangle
      case Quadrilateral(a, b, c, d) if a == 0 || b == 0 || c == 0 || d == 0 => NotAQuadrilateral
      case Quadrilateral(a, b, c, d) if a == b && b == c && c == d => SquaredQuadrilateral
      case Quadrilateral(a, b, c, d) if a == c && b == d => RectangleQuadrilateral
      case Quadrilateral(a, b, c, d) if a == c || b == d => TrapezoidQuadrilateral
      case Quadrilateral(a, b, c, d) => IrregularQuadrilateral
    }
  }
}

// TODO: Interfaz gráfica.
// TODO: Validaciones de lados igual a cero.
// TODO: Validaciones de caracteres.
// TODO: No quemar los objetos de prueba.
