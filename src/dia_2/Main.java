package dia_2;
import dia_2.models.persona;

public class Main {
  public static void main(String[] args) {
    persona persona1 = new persona("Oliver", "Price", 21, 1.81, "21020400-K", false, new String[]{"Firulais", "Richard"});
    persona persona2 = new persona("Agustin", "Russo", 20, 1.90, "21500657-3", false, new String[]{});
    persona1.setNombre("Benji");
    System.out.println(persona1.presentarse());
    System.out.println(persona2.presentarse());

  }
}
