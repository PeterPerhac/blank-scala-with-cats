package com.perhac.experiments

import cats.data.OptionT
import cats.instances.FutureInstances
import cats.syntax.ApplicativeSyntax

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration.Inf
import scala.concurrent.{Await, Future}

object Application extends FutureInstances with ApplicativeSyntax {

  def main(args: Array[String]): Unit = {
    val program = for {
      x <- OptionT(Option(42).pure)
    } yield x
    Await.result(program.getOrElse(0) map println, Inf)
  }

}

