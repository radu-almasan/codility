package com.radualmasan.codility.lesson6sorting

class Triangle {

  def solution(a: Array[Int]): Int = {
    val sorted = a.sorted

    val exists = (0 to sorted.length - 3)
      .exists(i => isTriangular(sorted(i), sorted(i + 1), sorted(i + 2)))

    if (exists) 1 else 0
  }

  def isTriangular(p: Int, q: Int, r: Int): Boolean = {
    p > r - q && p > q - r && q > p - r
  }
}
