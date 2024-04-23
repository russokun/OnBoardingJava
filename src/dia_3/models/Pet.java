package dia_3.models;
import dia_2.models.persona;

public class Pet {
  private String nombre;
  private petType tipo;
  private int edad;
  private persona propietario;

  // Constructor parametrizado sin la propiedad del propietario
  public Pet(String nombre, petType tipo, int edad) {
    this.nombre = nombre;
    this.tipo = tipo;
    this.edad = edad;
  }

  // Métodos accesorios (getters y setters)
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public petType getTipo() {
    return tipo;
  }

  public void setTipo(petType tipo) {
    this.tipo = tipo;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public persona getPropietario() {
    return propietario;
  }

  public void setPropietario(persona propietario) {
    this.propietario = propietario;
  }
}

