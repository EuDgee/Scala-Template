import org.scalatest.FlatSpec

class HelloSpec extends FlatSpec {
  info("Hello Tests")
  "Template" should "be filled with code" in {
    assert(false, "Don`t forget to code :)")
  }
}
