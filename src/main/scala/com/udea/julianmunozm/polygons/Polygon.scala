package com.udea.julianmunozm.polygons

sealed abstract class Polygon
case class Triangle(sideA: Int, sideB: Int, sideC:Int) extends Polygon

/**
  *<pre>     b      </pre>
  *<pre>  --------  </pre>
  *<pre> |        | </pre>
  *<pre>a|        |c</pre>
  *<pre> |        | </pre>
  *<pre>  --------  </pre>
  *<pre>     d      </pre>
  *
  * @param sideA The opposite of c
  * @param sideB The opposite of d
  * @param sideC The opposite of a
  * @param sideD The opposite of b
  */
case class Quadrilateral(sideA: Int, sideB: Int, sideC:Int, sideD: Int) extends Polygon
