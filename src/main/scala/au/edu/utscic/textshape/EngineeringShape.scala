package au.edu.utscic.textshape

/** A shape for comparing engineering documents
  * ===Purpose===
  * This shape is a basic template that splits a document based on newline characters
  * and measures intensity by vocabulary (TF/IDF)
  *  @constructor create a new engineeringShape with a set split pattern.
  */
class EngineeringShape extends AbstractShape {

  override val splitPattern: String = "[\n]+"

  /** Split the document into chunks
    *  @example {{{val chunkedString = chunk("my string\n split in two")}}}
    *  @param doc the string that is to be split
    *  @return a list of strings
    */
  override def chunk(doc:String):List[String] = doc.split(splitPattern).toList.filterNot(s => s.isEmpty || s.matches("[\\s]+"))

  //Return a raw value for this chunk
  override def intensity(chunk: String, doc: Option[String]): Double = ???

  //Return a distribution (list of normalised values) for a list of chunks
  override def density(chunks: List[String], intensity: (String, Option[String]) => Double): List[Double] = ???

  // The degree of similarity from 0 (none) to 1 (match)
  override def compare(testDistribution: List[Double], referenceDistribution: List[Double]): Double = ???
}
