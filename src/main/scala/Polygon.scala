sealed abstract class Polygon
case class Triangle(sideA: Int, sideB: Int, sideC:Int) extends Polygon

/**
  *
  * @param sideA The parallel side to c
  * @param sideB The parallel side to d
  * @param sideC The parallel side to a
  * @param sideD The parallel side to b
  */
case class Quadrilateral(sideA: Int, sideB: Int, sideC:Int, sideD: Int) extends Polygon
