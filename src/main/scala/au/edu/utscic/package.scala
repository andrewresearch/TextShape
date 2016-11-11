package au.edu.utscic

/**
  * Created by andrew@andrewresearch.net on 4/11/16.
  * [[http://andrewresearch.net]]
  *
  * Provides classes for comparing the shape of strings to the shape of a reference string
  *
  * ==Overview==
  *
  * The main features of AbstractShape are:
  *
  * - conceptually simple: basic structure, plus intensity of a feature
  *
  * - functional approach allowing shape matching to be applied to a stream
  *
  * The class [[au.edu.utscic.textshape.AbstractShape]] is abstract and needs to be extended for
  * specific applications.
  *
  * The class [[au.edu.utscic.textshape.EngineeringShape]] is an example shape based on...
  * It can be used as follows:
  * {{{
  *   import au.edu.utscic.textshape.EngineeringShape
  *   val shape = new EngineeringShape
  *   shape.chunk("My string that needs chunking.\n This is a new paragraph.")
  * }}}
  */
package object textshape {}
