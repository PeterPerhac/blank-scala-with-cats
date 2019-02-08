package com.perhac.experiments

import cats._
import cats.data._
import cats.implicits._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration.Inf
import scala.concurrent.{Await, Future}

object Application {

  def main(args: Array[String]): Unit = {
    val program = for {
      x <- OptionT(Option(42).pure[Future])
    } yield x
    Await.result(program.getOrElse(0).map(println), Inf)
  }

}

