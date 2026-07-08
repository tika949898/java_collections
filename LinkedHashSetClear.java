import java.util.LinkedHashSet;
public class LinkedHashSetClear {
  public static void main(String[] args) {
    LinkedHashSet<String> cars = new LinkedHashSet<String>();
    cars.add("BMW");
    cars.add("Aulto");
    cars.add("Maruti");
    cars.add("Maruti");
    cars.clear();

    System.out.println(cars);
  }
}
