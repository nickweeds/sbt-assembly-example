package main

import org.slf4j.LoggerFactory

object Main {

  def main(args: Array[String]): Unit = {
    val logger = LoggerFactory.getLogger("Main")
    logger.info("Main")
  }
}
