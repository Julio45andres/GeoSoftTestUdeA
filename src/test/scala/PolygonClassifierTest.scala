import org.scalatest.FunSuite

class PolygonClassifierTest extends FunSuite {

  // Triangles
  val Isosceles = "Isosceles"
  val Scalene = "Scalene"
  val Equilateral = "Equilateral"

  // Quadrilaterals
  val Square = "Square"
  val Rectangle = "Rectangle"
  val Trapezoid = "Trapezoid"
  val SomeOtherQuad = "Irregular or trapezium"

  test("PolygonClassifier.classify.Triangle"){
    // arrange
    val isoscelesTriangle = Triangle(sideA = 4, sideB = 5, sideC = 5)
    val scaleneTriangle = Triangle(2, 5, 6)
    val equilateralTriangle = Triangle(5, 5, 5)
    val classifier = new PolygonClassifier()
    // act
    val isosceles = classifier.classify(isoscelesTriangle)
    val scalene = classifier.classify(scaleneTriangle)
    val equilateral = classifier.classify(equilateralTriangle)
    // assert
    assert(isosceles.equals(Isosceles))
    assert(scalene.equals(Scalene))
    assert(equilateral.equals(Equilateral))
  }
  test("PolygonClassifier.classify.Quadrilateral"){
    // arrange
    val squareQuadrilateral = Quadrilateral(3, 3, 3, 3)
    val rectangleQuadrilateral = Quadrilateral(4, 7, 4, 7)
    val trapezoidQuadrilateral: Quadrilateral = Quadrilateral(sideA=2, sideB=4, sideC=6, sideD=4)
    val someQuad = Quadrilateral(3, 4, 2, 6)
    val classifier = new PolygonClassifier()
    // act
    val square = classifier.classify(squareQuadrilateral)
    val rectangle = classifier.classify(rectangleQuadrilateral)
    val trapezoid = classifier.classify(trapezoidQuadrilateral)
    val sQuad = classifier.classify(someQuad)
    // assert
    assert(square.equals(Square))
    assert(rectangle.equals(Rectangle))
    assert(trapezoid.equals(Trapezoid))
    assert(sQuad.equals(SomeOtherQuad))
  }
}
