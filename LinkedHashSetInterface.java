import java.util.Set;
import java.util.LinkedHashSet;
public class LinkedHashSetInterface {
  public static void main(String[] args) {
     Set<String> cars = new LinkedHashSet<String>();
    cars.add("BMW");
    cars.add("Aulto");
    cars.add("Maruti");
    cars.add("Maruti");

    System.out.println(cars);
  }
}
