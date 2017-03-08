package Class.Implicit

/**
  * Created by hadoop on 24/2/17.
  */
object StringUtils {
  implicit class StringImprovements(val s: String) {
    def increment = s.map(c => (c + 1).toChar)
  }
}