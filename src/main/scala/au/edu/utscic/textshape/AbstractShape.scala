package au.edu.utscic.textshape

/** The generic shape pattern requiring specific implementation
  *
  * @todo Potential intensity functions…
  *
  * 1. The number of important document words in a section. i.e. TF/IDF (document as collection, chunk as document), count of most rare words.
  * 2. Vocabulary - count of unique words per section
  * 3. Length - size of section
  * 4. Word2Vec similarity
  * 5. Cosine similarity of centroid
  *
  */
abstract class AbstractShape {

  val splitPattern:String = "[\n]+"

  //Split the document into chunks
  def chunk(doc:String):List[String] = doc.split(splitPattern).toList

  //Return a raw value for this chunk
  def intensity(chunk:String, doc:Option[String]):Double

  //Return a distribution (list of normalised values) for a list of chunks
  def density(chunks:List[String],intensity:(String,Option[String]) => Double):List[Double]

  // The degree of similarity from 0 (none) to 1 (match)
  def compare(testDistribution:List[Double],referenceDistribution:List[Double]): Double

}
