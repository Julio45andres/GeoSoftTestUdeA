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
  val SomeOtherQuad = "Irregular"

  // Objects
  val classifier = new PolygonClassifier()

  test("classify.Triangle"){
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
  test("Classify.Quad_rect_withZeroes"){
//    arrange
    val quad = Quadrilateral(5, 0, 5, 0)
//    act
    val quadTest = classifier classify quad
//    assert
    assert(!quadTest.equals(Rectangle))
  }
  test("Classify.Quad_square"){
    // arrange
    val square = Quadrilateral(6, 6, 6, 6)
//    act
    val squareTest = classifier classify square
//    assert
    assert(squareTest.equals(Square))
  }
  test("Classify.Quad_rectangle_6_6_4_4"){
    // arrange
    val noOrderedRectangle = Quadrilateral(6, 6, 4, 4)
    // act
    val noOrderedRect:String = classifier.classify(noOrderedRectangle)
    // assert
    assert(noOrderedRect.equals(Rectangle))
  }
  test("Classify.Quad_trapezoid_7_9_7_2"){
//    arrange
    val trapezoid = Quadrilateral(7, 9, 7, 2)
//    act
    val trapezoidTest = classifier classify trapezoid
//    assert
    assert(trapezoidTest.equals(Trapezoid))
  }
  test("Classify.Quad_Irregular_8_7_9_1"){
//    arrange
    val irregular = Quadrilateral(8, 7, 9, 1)
//    act
    val irregularTest = classifier classify irregular
//    assert
    assert(irregularTest.equals(SomeOtherQuad))
  }
}
