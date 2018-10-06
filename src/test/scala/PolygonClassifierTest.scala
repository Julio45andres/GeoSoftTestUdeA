import com.udea.julianmunozm.polygons._
import org.scalatest.FunSuite

class PolygonClassifierTest extends FunSuite {

  // Triangles
  val Isosceles: PolygonType = IsoscelesTriangle
  val Scalene: PolygonType = ScaleneTriangle
  val Equilateral:PolygonType = EquilateralTriangle
//val NotATriangle

  // Quadrilaterals
  val Square: PolygonType = SquaredQuadrilateral
  val Rectangle: PolygonType = RectangleQuadrilateral
  val Trapezoid: PolygonType = TrapezoidQuadrilateral
  val SomeOtherQuad: PolygonType = IrregularQuadrilateral

  // Objects
  val classifier = new PolygonClassifier()

  test("Classify.Triangle_0_7_2_NotATriangle"){
    //    arrange
    val notATriangle = Triangle(0, 7, 2)
    //    act
    val triangleType = classifier classify  notATriangle
    //    assert
    assert(triangleType equals NotATriangle)
  }
  test("Classify.Triangle_4_4_4_Equilateral"){
    //    arrange
    val equilateral = Triangle(sideA = 4, sideB = 4, sideC = 4)
    //    act
    val triangleType = classifier classify equilateral
    //    assert
    assert(triangleType.equals(Equilateral))
  }
  test("Classify-Triangle_3_4_4_Isosceles"){
    //    arrange
    val isosceles = Triangle(3, 4, 4)
    //    act
    val triangleType = classifier classify isosceles
    //    assert
    assert(triangleType.equals(Isosceles))
  }
  test("Classify-Triangle_5_4_9_Scalene"){
    //    arrange
    val scalene = Triangle(5, 4, 9)
    //    act
    val triangleType = classifier classify scalene
    //    assert
    assert(triangleType equals Scalene)
  }
  test("Classify.Quad_4_5_0_2_NotAQuad"){
//    arrange
    val notAQuad = Quadrilateral(4, 5, 0, 2)
//    act
    val quadType = classifier classify notAQuad
//    assert
    assert(quadType equals NotAQuadrilateral)
  }
  test("Classify.Quad_5_5_5_5_square"){
    //    arrange
    val quad = Quadrilateral(5, 5, 5, 5)
    //    act
    val quadType = classifier classify quad
    //    assert
    assert(quadType equals Square)
  }
  test("Classify.Quad_rectangle_4_6_4_6"){
    //    arrange
    val quad = Quadrilateral(4, 6, 4, 6)
    //    act
    val quadType = classifier classify quad
    //    assert
    assert(quadType equals Rectangle)
  }
  test("Classify.Quad_trapezoid_7_9_7_2"){
    //    arrange
    val quad = Quadrilateral(7, 9, 7, 2)
    //    act
    val quadType = classifier classify quad
    //    assert
    assert(quadType equals Trapezoid)
  }
  test("Classify.Quad_Irregular_8_7_9_1"){
    //    arrange
    val quad = Quadrilateral(8, 7, 9, 1)
    //    act
    val quadType = classifier classify quad
    //    assert
    assert(quadType equals SomeOtherQuad)
  }
}
