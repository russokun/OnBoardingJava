package dia_4;

public class Calculator implements CalculatorOperations{
  @Override
  public int sum(int a, int b) {
    return a + b;
  }
  @Override
  public int substract(int a, int b) {
    return a - b;
  }
  @Override
  public int multiply(int a, int b) {
    return a * b;
  }
  @Override
  public int divide(int a, int b) {
    if (b != 0) {
      return a / b;
    } else {
      System.out.println("Error: División por cero");
      return 0;
    }
  }
}
