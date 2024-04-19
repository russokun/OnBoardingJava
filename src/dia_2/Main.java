package dia_2;

public class Main {
  public static class persona{
    private String nombre, apellido;
    private int edad;
    private double altura;
    private String dni;
    private boolean casado;
    public persona(String nombre, String apellido, int edad, double altura, String dni, boolean casado){
      this.nombre = nombre;
      this.apellido = apellido;
      this.edad = edad;
      this.altura = altura;
      this.dni = dni;
      this.casado = casado;
    }
    // Getters
    public String getNombre() {
      return nombre;
    }
    public String getApellido() {
      return apellido;
    }
    public int getEdad() {
      return edad;
    }
    public double getAltura() {
      return altura;
    }
    public String getDni() {
      return dni;
    }
    public String isCasado() {
      return casado?"Casado/a":"No Casado/a";
    }
    // Setters
    public void setNombre(String nombre) {
      this.nombre = nombre;
    }
    public void setApellido(String apellido) {
      this.apellido = apellido;
    }
    public void setEdad(int edad) {
      this.edad = edad;
    }
    public void setAltura(double altura) {
      this.altura = altura;
    }
    public void setDni(String dni) {
      this.dni = dni;
    }
    public void setCasado(boolean casado) {
      this.casado = casado;
    }
  }
  public static void main(String[] args) {
    persona p1 = new persona("Oliver", "Atom", 21, 1.75, "21900400-3", true);
    persona p2 = new persona("Agustin", "Russo", 20, 1.90, "21500657-3", false);
    System.out.println("Presentacion de "+ p1.getNombre()+":");
    System.out.println("Hola! mi nombre es: " + p1.getNombre() + " " + p1.getApellido()+".");
    System.out.println("Tengo " + p1.getEdad()+ " años y mido " + p1.getAltura() + " metros de altura.");
    System.out.println("Estado civil: " + p1.isCasado()+".");
    System.out.println("DNI: " + p1.getDni()+".");
    //aqui irian mascotas :V
    System.out.println("---------------------------------");
    System.out.println("Presentacion de "+ p2.getNombre()+":");
    System.out.println("Hola! mi nombre es: " + p2.getNombre() + " " + p2.getApellido()+".");
    System.out.println("Tengo " + p2.getEdad()+ " años y mido " + p2.getAltura() + " metros de altura.");
    System.out.println("Estado civil: " + p2.isCasado()+".");
    System.out.println("DNI: " + p2.getDni()+".");
  }
}
