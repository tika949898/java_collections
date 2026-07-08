import java.util.LinkedHashSet;
public class LinkedHashSetRemove {
  public static void main(String[] args) {
    LinkedHashSet<String> cars = new LinkedHashSet<String>();
    cars.add("BMW");
    cars.add("Aulto");
    cars.add("Maruti");
    cars.add("Maruti");
    cars.remove("Maruti");

    System.out.println(cars);
  }
}
