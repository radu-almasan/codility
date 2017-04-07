package com.radualmasan.codility.lesson6sorting

class MaxProductOfThree {

  def solution(a: Array[Int]): Int = {
    val sorted = a.sorted
    val top3 = sorted.takeRight(3)

    if (areAllTop3Negatives(top3)) {
      if (top3.contains(0) || top3.exists(_ < 0)) {
        val top2Negative = sorted.filter(_ < 0).take(2)

        if (top2Negative.length == 2) return top3(2) * top2Negative.product
        else if (top3.contains(0)) return 0
      }

      if (betterToUseSmallestNegatives(sorted, top3))
        return sorted.take(2).product * top3.takeRight(1)(0)
    }

    top3.product
  }

  private def areAllTop3Negatives(top3: Array[Int]) = {
    top3.takeRight(1)(0) > 0
  }

  private def betterToUseSmallestNegatives(sorted: Array[Int], top3: Array[Int]) = {
    sorted.take(2).product > top3.take(2).product
  }
}
