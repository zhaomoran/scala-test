package org.genitus.scala

import org.scalatest.FlatSpec

class ScalaUnitTest extends FlatSpec{
  "A ScalaUnit" should "have sum two number" in {
    assert(new ScalaUnit().sum(1,2) === 3)
  }
}
