package dia_2.models;

public class persona {
  private String nombre;
  private String apellido;
  private int edad;
  private double altura;
  private String dni;
  private boolean casado;
  private String[] petsNames;

  public persona(String nombre, String apellido, int edad, double altura, String dni, boolean casado, String[] petsNames) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.altura = altura;
    this.dni = dni;
    this.casado = casado;
    this.petsNames = petsNames;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public boolean isCasado() {
    return casado;
  }

  public void setCasado(boolean casado) {
    this.casado = casado;
  }

  public String[] getPetsNames() {
    return petsNames;
  }

  public void setPetsNames(String[] petsNames) {
    this.petsNames = petsNames;
  }

  public String presentarse() {
    String estadoCivil = casado ? "Estoy Casado/a" : "No estoy casado/a";
    String mascotasString = petsNames.length == 0 ? "no tengo mascotas" : "Mis mascotas se llaman: " + String.join(", ", petsNames);
    return "Hola, Mi nombre es " + nombre + " " + apellido + ".\nTengo " + edad + " años y mido " + altura + " metros de altura.\nMi DNI es " + dni + ".\n" + estadoCivil + ".\n" + mascotasString + ".";
  }
}