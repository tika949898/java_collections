import java.util.LinkedHashSet;
public class LinkedHashSetLoop {
  public static void main(String[] args) {
    LinkedHashSet<String> cars = new LinkedHashSet<String>();
    cars.add("BMW");
    cars.add("Aulto");
    cars.add("Maruti");
    cars.add("Maruti");

    for (String i : cars) {
    System.out.println(i);
    }
  }
}
