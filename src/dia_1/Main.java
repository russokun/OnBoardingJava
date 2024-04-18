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
}

