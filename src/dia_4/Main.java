package dia_4;
import dia_4.CalculatorWithMenu;
public class Main {
  public static void main(String[] args){
    CalculatorWithMenu calculator = new CalculatorWithMenu();
    int option;
    do {
      option = calculator.showMenu();
      calculator.executeOperation(option);
    } while (option != 5);


  }
}
