import java.util.LinkedHashSet;
public class LinkedHashSetSize {
  public static void main(String[] args) {
    LinkedHashSet<String> cars = new LinkedHashSet<String>();
    cars.add("BMW");
    cars.add("Aulto");
    cars.add("Maruti");
    cars.add("Maruti");

    System.out.println(    cars.size());
  }
}
