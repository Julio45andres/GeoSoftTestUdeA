package com.udea.julianmunozm.polygons

sealed trait PolygonType
case object EquilateralTriangle extends PolygonType
case object ScaleneTriangle extends PolygonType
case object IsoscelesTriangle extends PolygonType
case object NotATriangle extends PolygonType
case object NotAQuadrilateral extends PolygonType
case object SquaredQuadrilateral extends PolygonType
case object RectangleQuadrilateral extends PolygonType
case object TrapezoidQuadrilateral extends PolygonType
case object IrregularQuadrilateral extends PolygonType