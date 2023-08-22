import InternalTestingDSL.SpecificationTests;
import MathClasses.MyMath;

class SpecificationTestExamples {
  public static void main(String[] args) {
    SpecificationTests tests = new SpecificationTests();

    tests.describe("These tests will cover integers")
      .addTest().it("should be seven").expect(3 + 4 == 7)
      .addTest().it("should be zero").expect(4 % 2 == 0);

    String message = "Hello, world!";
    tests.describe("These tests will cover Strings")
      .addTest().it("should contain 'World'").expect(message.contains("World"))
      .addTest().it("should be less than 20 characters long").expect(message.length() < 20);

    tests.describe("These tests will cover the MyMath class")
      .addTest().it("should be even").expect(MyMath.isEven(64))
      .addTest().it("should be odd").expect(MyMath.isOdd(71))
      .addTest().it("should be 256").expect(MyMath.pow(2, 8) == 256);

    tests.run();
  }
}