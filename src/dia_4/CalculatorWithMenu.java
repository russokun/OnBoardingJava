package dia_4;

import java.util.Scanner;

public class CalculatorWithMenu implements CalculatorMenu{
  private CalculatorOperations operaciones;
  private Scanner scanner;

  public CalculatorWithMenu(){
    this.operaciones = new Calculator();
    this.scanner = new Scanner(System.in);
  }

  @Override
  public int showMenu() {
    System.out.println("Bienvenidos a la Besto Calculadora do Mundo!\n" + "Seleccione una opción:\n");
    System.out.println("1. Suma");
    System.out.println("2. Resta");
    System.out.println("3. Multiplicación");
    System.out.println("4. División");
    System.out.println("5. Salir");
    System.out.println("Ingrese su opción:");
    return scanner.nextInt();
  }

  @Override
  public void executeOperation(int option) {
    int a, b, result;
    switch (option) {
      case 1:
        System.out.println("Ingrese el primer número:");
        a = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        b = scanner.nextInt();
        result = operaciones.sum(a, b);
        System.out.println("El resultado de la suma es: " + result);
        break;
      case 2:
        System.out.println("Ingrese el primer número:");
        a = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        b = scanner.nextInt();
        result = operaciones.substract(a, b);
        System.out.println("El resultado de la resta es: " + result);
        break;
      case 3:
        System.out.println("Ingrese el primer número:");
        a = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        b = scanner.nextInt();
        result = operaciones.multiply(a, b);
        System.out.println("El resultado de la multiplicacion es: " + result);
        break;
      case 4:
        System.out.println("Ingrese el primer número:");
        a = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        b = scanner.nextInt();
        result = operaciones.divide(a, b);
        System.out.println("El resultado de la division es: " + result);
        break;
      case 5:
        System.out.println("Salir");
        break;
      default:
        System.out.println("Opción no válida");
        break;
    }
  }


}
