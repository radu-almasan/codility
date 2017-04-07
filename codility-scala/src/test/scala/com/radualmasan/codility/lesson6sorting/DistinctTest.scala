package com.radualmasan.codility.lesson6sorting

import org.hamcrest.CoreMatchers.is
import org.junit.Assert._
import org.junit._

@Test
class DistinctTest {

  val distinct = new Distinct

  @Test
  def testGivenExample() = assertThat(distinct.solution(Array(2, 1, 1, 1, 2, 3, 1)), is(3))

}


