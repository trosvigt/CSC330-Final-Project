package InternalTestingDSL;

public class SpecificationTests {
  private String message;

  public SpecificationTests(String message) {
    this.message = message;
  }

  public void printMesssage() {
    System.out.println(message);
  }
}