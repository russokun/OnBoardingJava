package dia_1;
import java.util.Scanner;

public class Main {
  //Ejercicio 1
  public static class Saludo {
    public static void main(String[] args) {
      String nombre = "Agustín";
      String apellido = "Russo";
      int edad = 20;
      // Llamo al método saludo y le paso los parámetros
      saludo(nombre, apellido, edad);
    }
    // Método saludo que recibe el nombre, apellido y edad como parámetros
    public static void saludo(String nombre, String apellido, int edad) {
      System.out.println("Hola, soy " + nombre + " " + apellido + " y tengo " + edad + " años.");
    }
  }
  //ejercicio 2
  public static class bienvenida {
  public static void main(String[] args) {

      String nombre = "Agustín";
      mensaje(nombre);
      }

    private static void mensaje(String nombre) {
      System.out.println("Bienvenido " + nombre + " al Modulo 3 de Java!");
    }
  }
  //ejercicio 3
  public static class verification{
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Ingrese un número");
      int numero1 = scanner.nextInt();
      System.out.println("Ingrese otro número");
      int numero2 = scanner.nextInt();
      System.out.println("Ingrese otro número mas");
      int numero3 = scanner.nextInt();
      comparator(numero1, numero2, numero3);
    }
    public static void comparator(int numero1, int numero2, int numero3){
      if (numero1 > numero2 && numero1 > numero3){
        System.out.println("El número " + numero1 + " es el mayor");
      } else if (numero2 > numero1 && numero2 > numero3){
        System.out.println("El número " + numero2 + " es el mayor");
      } else if (numero3 > numero1 && numero3 > numero2){
        System.out.println("El número " + numero3 + " es el mayor");
      } else {
        System.out.println("Los números son iguales");
      }
    }
  }
  //ejercicio 4
  public static class parImpar{
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Ingrese un número");
      int numero = scanner.nextInt();
      paryImpar(numero);
    }
    public static void paryImpar(int numero){
      if (numero % 2 == 0){
        System.out.println("El número " + numero + " es par");
      } else {
        System.out.println("El número " + numero + " es impar");
      }
    }
  }
  //ejercicio 5
  public static class dosCadenas{
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Ingrese una cadena de texto");
      String cadena1 = scanner.nextLine();
      System.out.println("Ingrese otra cadena de texto");
      String cadena2 = scanner.nextLine();
      iguales(cadena1, cadena2);
    }
    public static void iguales(String cadena1, String cadena2){
      if (cadena1.contentEquals(cadena2)){
        System.out.println("Las cadenas son iguales.");
      } else {
        System.out.println("Las cadenas son diferentes.");
      }
    }
  }
  //ejercicio 6
  public static class esPrimo{
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Ingrese un número");
      int numero = scanner.nextInt();
      primo(numero);
    }
    public static void primo(int numero){
      int contador = 2;
      boolean primo = true;
      while ((primo) && (contador != numero)){
        if (numero % contador == 0){
          primo = false;
        }
        contador++;
      }
      if (primo){
        System.out.println("El número " + numero + " es primo.");
      } else {
        System.out.println("El número " + numero + " no es primo.");
      }
    }
  }
  //ejercicio 7
  public static class Matriz {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Ingrese el número de filas de la matriz");
      int i = scanner.nextInt();
      System.out.println("Ingrese el número de columnas de la matriz");
      int j = scanner.nextInt();

      int[][] matriz = new int[i][j];

      for (int fila = 0; fila < i; fila++){
        for (int columna = 0; columna < j; columna++){
          System.out.println("Ingrese un número para la posición [" + fila + "][" + columna + "]");
          matriz[fila][columna] = scanner.nextInt();
        }
      }

      sumaImpares(matriz);
    }

    public static void sumaImpares(int[][] matriz){
      int suma = 0;
      for (int fila = 0; fila < matriz.length; fila++){
        for (int columna = 0; columna < matriz[fila].length; columna++){
          if (matriz[fila][columna] % 2 != 0){
            suma += matriz[fila][columna];
          }
        }
      }
      System.out.println("La suma de los números impares de la matriz es: " + suma);
    }
  }
  //ejercicio 8
  public static class matriz2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de filas de la matriz");
        int i = scanner.nextInt();
        System.out.println("Ingrese el número de columnas de la matriz");
        int j = scanner.nextInt();

        int[][] matriz = new int[i][j];

        for (int fila = 0; fila < i; fila++){
            for (int columna = 0; columna < j; columna++){
                System.out.println("Ingrese un número para la posición [" + fila + "][" + columna + "]");
                matriz[fila][columna] = scanner.nextInt();
            }
        }

        CualesSonPares(matriz);
        sumaPrimos(matriz);
    }

    public static void CualesSonPares(int[][] matriz){
        for (int fila = 0; fila < matriz.length; fila++){
            for (int columna = 0; columna < matriz[fila].length; columna++){
                if (matriz[fila][columna] % 2 == 0){
                    System.out.println("El número " + matriz[fila][columna] + " es par.");
                }
            }
        }
    }

    public static void sumaPrimos(int[][] matriz){
        int suma = 0;
        for (int fila = 0; fila < matriz.length; fila++){
            for (int columna = 0; columna < matriz[fila].length; columna++){
                if (esPrimo(matriz[fila][columna])){
                    suma += matriz[fila][columna];
                }
            }
        }
        System.out.println("La suma de los números primos de la matriz es: " + suma);
    }

    public static boolean esPrimo(int numero){
        if (numero <= 1) return false;
        for (int i = 2; i < numero; i++){
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }

  }
  //ejercicio 9
  public static class calculadoraConExit{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        String operacion = "";
        boolean salir = false;

        while (!salir){
            System.out.println("Ingrese un número (0 para salir)");
            numero1 = scanner.nextInt();
            if (numero1 == 0) {
                salir = true;
                break;
            }
            System.out.println("Ingrese otro número");
            numero2 = scanner.nextInt();
            System.out.println("Ingrese la operación que desea realizar (+, -, *, /)");
            operacion = scanner.next();

            switch (operacion){
                case "+":
                    System.out.println("El resultado de la suma es: " + (numero1 + numero2));
                    break;
                case "-":
                    System.out.println("El resultado de la resta es: " + (numero1 - numero2));
                    break;
                case "*":
                    System.out.println("El resultado de la multiplicación es: " + (numero1 * numero2));
                    break;
                case "/":
                    if (numero2 != 0) {
                        System.out.println("El resultado de la división es: " + (numero1 / numero2));
                    } else {
                        System.out.println("No se puede dividir por cero");
                    }
                    break;
                default:
                    System.out.println("Operación no válida");
            }
        }
    }
  }
  //ejercicio 10
}

