# Internal Testing DSL

Tristan Trosvig

CSC 330 - Language Design and Implementation

Created in August of 2023
## Overview
This project demonstrates an internal testing DSL (domain specific language) written in the Java programming language. A fluent interface is used to allow testing to flow like natural language through method chaining. The flow is as follows:

1. Initialize a SpecificationTests object
2. Create a test group by describing the tests within that group
3. Add tests to the group
   - Add a test description
   - Add a test expectation
4. Repeat steps two through three on the instance created in step one as many tames as you would like
5. Run all tests and view results

## Structure

SpecificationTestsInstance.describe("Some description for test group")

.addTest().it("should describe test").expect(boolean expression)

... (Chain as many tests as you would like)

.addTest().it("should describe test").expect(boolean expression)

SpecificationTestsInstance.run()

## Breakdown
- **describe(String)**
  - Creates a SpecificationGroup object and assigns the description to the group
- **addTest()**
  - Creates a SpecificationTest object and associates it with the SpecificationGroup
- **it(String)**
  - Assigns test description
- **expect(boolean)**
  - Assigns test expression
- **run()**
  - Called on SpecificationTests instance
  - Runs all tests and displays results


## Java Example

```
// Instanciate test object
SpecificationTests tests = new SpecificationTests();

// Message for testing
String message = "Hello, world!";

// Group, create, and describe tests
tests.describe("These tests will cover Strings")
  .addTest()
    .it("should contain 'World'")
    .expect(message.contains("World"))
  .addTest()
    .it("should be less than 20 characters long")
    .expect(message.length() < 20);

// Run tests and display results
tests.run();
```

Output:
```
Description: These tests will cover Strings
===========================================
It should contain 'World' : Failed
It should be less than 20 characters long : Passed

---------------------------------------
Results: Passed: 1 | Failed: 1
```