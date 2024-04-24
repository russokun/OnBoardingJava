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
  public String divide(int a, int b) {
    if (b != 0) {
      return "El resultado de la division es: "+ a / b;
    } else {
      return "1ND3T3RM1N4T3D-3RR0R!";
    }
  }
}
