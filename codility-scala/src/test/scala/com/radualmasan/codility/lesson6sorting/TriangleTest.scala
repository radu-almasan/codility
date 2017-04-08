package com.radualmasan.codility.lesson6sorting

import org.hamcrest.CoreMatchers.is
import org.junit.Assert._
import org.junit._

class TriangleTest {

  val triangle = new Triangle

  @Test
  def testPositiveGivenExample() = assertThat(triangle.solution(Array(10, 2, 5, 1, 8, 20)), is(1))

  @Test
  def testNegativeGivenExample() = assertThat(triangle.solution(Array(10, 50, 5, 1)), is(0))

  @Test
  def testGivenExampleAfterFail1() = assertThat(triangle.solution(Array(5, 3, 3)), is(1))

  @Test
  def testGivenExampleAfterFail2() = assertThat(triangle.solution(Array(-2, -2, -2)), is(0))
}
