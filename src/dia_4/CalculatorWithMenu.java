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
    System.out.println("Bienvenidos a la Besto Calculadora do Mundo!\n" + "Seleccione una opción:");
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
        System.out.println("El resultado de la suma es: " + result + "\n");
        break;
      case 2:
        System.out.println("Ingrese el primer número:");
        a = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        b = scanner.nextInt();
        result = operaciones.substract(a, b);
        System.out.println("El resultado de la resta es: " + result + "\n");
        break;
      case 3:
        System.out.println("Ingrese el primer número:");
        a = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        b = scanner.nextInt();
        result = operaciones.multiply(a, b);
        System.out.println("El resultado de la multiplicacion es: " + result + "\n");
        break;
      case 4:
        System.out.println("Ingrese el primer número:");
        a = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        b = scanner.nextInt();
        String resultDiv = operaciones.divide(a, b);
        System.out.println( resultDiv + "\n");
        break;
      case 5:
        System.out.println("Gracias por usar la Besto Calculadora do Mundo!, CHAU PA :v");
        break;
      default:
        System.out.println("Opción Invalida, intente de nuevo\n");
        break;
    }
  }


}
