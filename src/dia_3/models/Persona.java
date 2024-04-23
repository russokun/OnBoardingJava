package dia_3.models;
import dia_3.models.Pet;
import java.util.ArrayList;
import java.util.List;

public class Persona {
  private String nombre;
  private String apellido;
  private int edad;
  private double altura;
  private String dni;
  private boolean casado;
  private List<Pet> pets = new ArrayList<>();

  public Persona(String nombre, String apellido, int edad, double altura, String dni, boolean casado, String[] pets) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.altura = altura;
    this.dni = dni;
    this.casado = casado;
    // Agregar mascotas a la lista de mascotas de la persona
    for (String petName : pets) {
      this.pets.add(new Pet(petName, petType.otros, 0)); // Tipo y edad ficticios, pueden ajustarse según necesidad
    }
  }

  public void addPet(Pet pet) {
    pets.add(pet);
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

  public List<Pet> getPets() {
    return pets;
  }

  public String displayMascotas() {
    StringBuilder mascotasString = new StringBuilder();
    if (pets.isEmpty()) {
      mascotasString.append("No tengo mascotas.");
    } else {
      mascotasString.append("Mis mascotas son:\n");
      for (Pet pet : pets) {
        mascotasString.append("- ").append(pet.getNombre()).append(", es un ").append(pet.getTipo()).append(" y tiene ").append(pet.getEdad()).append(" años.\n");
      }
    }
    return mascotasString.toString();
  }

  public String present() {
    String estadoCivil = casado ? "Estoy casado/a" : "No estoy casado/a";
    return "Presentacion de " +nombre +":\n" +
            "¡Hola! mi nombre es " + nombre + " " + apellido + ".\n" +
            "Tengo " + edad + " años y mido " + altura + " metros de altura.\n" +
            "Mi DNI es " + dni + ".\n" +
            estadoCivil + ".\n" +
            displayMascotas();
  }
}
