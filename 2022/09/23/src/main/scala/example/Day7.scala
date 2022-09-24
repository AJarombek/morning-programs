package example

import org.apache.spark.sql.types.{DoubleType, StringType, StructField, StructType}
import org.apache.spark.sql.{DataFrame, Row, SparkSession}

/**
 * Basic Scala code for the seventh day of exploration.
 *
 * Date: 9/23/2022
 *
 * @author Andrew Jarombek
 */

object Day7 {
  def title: String =
    "day 7"

  def createDF: DataFrame = {
    val data = scala.Seq(
      Row("9/23/2022", "strength", null, "0:35:00"),
      Row("9/23/2022", "core", null, "0:20:00"),
      Row("9/23/2022", "walk", 2.5, null),
      Row("9/23/2022", "indoor bike", null, "0:30:00"),
      Row("9/24/2022", "strength", null, "0:40:00"),
      Row("9/24/2022", "core", null, "0:20:00"),
      Row("9/24/2022", "kayak", 6d, null),
      Row("9/24/2022", "indoor bike", null, "0:40:00"),
      Row("9/25/2022", "strength", null, "0:40:00"),
      Row("9/25/2022", "core", null, "0:20:00"),
      Row("9/25/2022", "kayak", 6d, null),
      Row("9/25/2022", "indoor bike", null, "0:50:00"),
      Row("9/25/2022", "walk", 2d, null),
      Row("9/25/2022", "run", 1d, null),
    )

    val schema = List(
      StructField("date", StringType, nullable = false),
      StructField("type", StringType, nullable = false),
      StructField("miles", DoubleType, nullable = true),
      StructField("duration", StringType, nullable = true),
    )

    val spark = SparkSession
      .builder
      .appName("Day 7")
      .config("spark.master", "local")
      .getOrCreate()

    spark.createDataFrame(
      spark.sparkContext.parallelize(data),
      StructType(schema)
    )
  }

  def main(args: Array[String]): Unit = {
    println(title)

    val df = createDF
    df.show()
  }
}
