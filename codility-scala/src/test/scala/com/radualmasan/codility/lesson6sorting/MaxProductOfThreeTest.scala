package com.radualmasan.codility.lesson6sorting

import org.hamcrest.CoreMatchers.is
import org.junit.Assert.assertThat
import org.junit.Test

class MaxProductOfThreeTest {

  val maxProductOfThree = new MaxProductOfThree

  @Test
  def testGivenExample() = assertThat(maxProductOfThree.solution(Array(-3, 1, 2, -2, 5, 6)), is(60))

  @Test
  def testOneTriple() = assertThat(maxProductOfThree.solution(Array(-3, 1, 2)), is(-6))

  @Test
  def testGivenExample2() = assertThat(maxProductOfThree.solution(Array(4, 5, 1, 0)), is(20))

  @Test
  def testTop3Contains0() = assertThat(maxProductOfThree.solution(Array(-2, -1, -1, 0, 1, 2)), is(4))

  @Test
  def testNegativesProduceGreaterThanPositivesProduce() =
    assertThat(maxProductOfThree.solution(Array(-4, -6, 3, 4, 5)), is(120))

  @Test
  def testAllNegatives() = assertThat(maxProductOfThree.solution(Array(-5, -6, -4, -7, -10)), is(-120))
}
