package InternalTestingDSL;

public class SpecificationTest {
  private SpecificationGroup group;
  private String description;
  private boolean expression;

  // Receive and set the group from the SpecificationGroup class
  public SpecificationTest(SpecificationGroup group) {
    this.group = group;
  }

  // Receive and set description
  public SpecificationTest it(String description) {
    this.description = "It " + description;

    return this;
  }

  // Receive and set the boolean epxression
  public SpecificationGroup expect(boolean expression) {
    this.expression = expression;

    return group;
  }

  // =======
  // Getters
  // =======
  public String getDescription() {
    return description;
  }

  public boolean getExpression() {
    return expression;
  }
}