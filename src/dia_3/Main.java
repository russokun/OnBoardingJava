package dia_3;
import dia_3.models.Pet;
import dia_3.models.Persona;
import dia_3.models.petType;

public class Main {
  public static void main(String[] args){
    Persona persona1 = new Persona("Oliver", "Price", 21, 1.81, "21020400-K", false, new String[]{});
    Persona persona2 = new Persona("Agustin", "Russo", 20, 1.90, "21500657-3", false, new String[]{});
    Pet mascota1 = new Pet("Firulais", petType.perro, 5);
    persona1.addPet(mascota1);
    System.out.println(persona1.present());
    System.out.println(persona2.present());
  }
}
