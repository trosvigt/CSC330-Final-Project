import java.util.ArrayList;
import InternalTestingDSL.SpecificationTests;
import MathClasses.MyMath;
import StackClass.MyStack;

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
      .addTest().it("should be 256").expect(MyMath.pow(2, 8) == 256)
      .addTest().it("should return 120").expect(MyMath.factorial(5) == 120);

    // Setup for MyStack tests
    Integer[] arrayItems = new Integer[] {1, 54, 17, 2, 3, 19, 12};
    ArrayList<Integer> arrayListItems = new ArrayList<Integer>();
    arrayListItems.add(1);
    arrayListItems.add(2);
    arrayListItems.add(3);
    MyStack<Integer> arrayIntegerStack = new MyStack<Integer>(arrayItems);
    MyStack<Integer> arrayListIntegerStack = new MyStack<Integer>(arrayListItems);
    MyStack<Integer> intStack = new MyStack<Integer>();

    tests.describe("These tests will cover the MyStack class")
      .addTest().it("should be empty").expect(intStack.empty())
      .addTest().it("should add 7 to the stack").expect(intStack.push(7) == 7)
      .addTest().it("should no longer be empty").expect(!intStack.empty())
      .addTest().it("should add 13 to the stack").expect(intStack.push(13) == 13)
      .addTest().it("should add 27 to the stack").expect(intStack.push(27) == 27)
      .addTest().it("should peek and see 27").expect(intStack.peek() == 27)
      .addTest().it("should search for and find 13").expect(intStack.search(13) == 1)
      .addTest().it("should remove 27").expect(intStack.pop() == 27)
      .addTest().it("should not be able to find 27").expect(intStack.search(27) == -1)
      .addTest().it("should peek and see 13").expect(intStack.peek() == 13)
      .addTest().it("should have initial ArrayList values").expect(!arrayListIntegerStack.empty())
      .addTest().it("should have initial array values").expect(!arrayIntegerStack.empty());

    tests.run();
  }
}