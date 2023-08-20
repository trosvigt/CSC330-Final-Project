package InternalTestingDSL;

import java.util.ArrayList;

public class SpecificationTests {
  private ArrayList<SpecificationGroup> groups = new ArrayList<>();
  private int passed = 0;
  private int testCount = 0;

  // No-arg constructor
  public SpecificationTests() {

  }

  // Used to describe and create a new test group
  public SpecificationGroup describe(String description) {
    SpecificationGroup group = new SpecificationGroup(description);
    groups.add(group);

    return group;
  }

  // Run all tests and display results
  public void run() {
    String message;

    // Display header
    System.out.println("Test Groups");
    System.out.println("-----------");
    System.out.println();

    // Run tests for each group
    for (SpecificationGroup group : groups) {
      passed += group.runTests();
      testCount += group.getTestCount();
    }

    // Display final test counts
    System.out.println("---------------------------------------");
    message = String.format("Final Results: Passed: %s | Failed: %s", passed, testCount - passed);
    System.out.println(message);
  }
}