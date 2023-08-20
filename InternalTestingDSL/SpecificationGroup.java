package InternalTestingDSL;

import java.util.ArrayList;

public class SpecificationGroup {
  private ArrayList<SpecificationTest> tests = new ArrayList<SpecificationTest>();
  private String description = null;

  // Receive and set the description from the SpecificationTests class
  public SpecificationGroup(String description) {
    this.description = description;
  }

  // Create and return a SpecificationTest instance
  public SpecificationTest addTest() {
    // Create test instance and associate it with the test group
    SpecificationTest test = new SpecificationTest(this);

    // Add to group list
    tests.add(test);

    return test;
  }

  // Display tests for the user
  public int runTests() {
    // Variable declarations/initializations
    String message;
    String result;
    int dividerLength = 0;
    int passCount = 0;

    // Display description
    message = String.format("Description: %s", description);
    System.out.println(message);

    // Get the length of the description to determine length
    // of the divider
    dividerLength = message.length();
    message = "=".repeat(dividerLength);
    System.out.println(message);

    // Loop over each test
    for (SpecificationTest test : tests) {
      // Save pass/fail result
      if (test.getExpression()) {
        result = "Passed";

        passCount++;
      } else {
        result = "Failed";
      }
      
      // Display test description and result
      message = String.format("%s : %s", test.getDescription(), result);
      System.out.println(message);
    }

    System.out.println();

    return passCount;
  }

  // =======
  // Getters
  // =======

  // Get number of tests in group
  public int getTestCount() {
    return tests.size();
  }
}