package com.radualmasan.codility.lesson6sorting

import scala.util.Sorting

class Distinct extends App {

  def solution(a: Array[Int]): Int = {
    Sorting.quickSort(a)
    a.distinct.count(_ => true)
  }
}
