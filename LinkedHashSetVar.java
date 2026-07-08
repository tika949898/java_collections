import java.util.LinkedHashSet;
public class LinkedHashSetVar {
  public static void main(String[] args) {
     var cars = new LinkedHashSet<String>();
    cars.add("BMW");
    cars.add("Aulto");
    cars.add("Maruti");
    cars.add("Maruti");

    for (String i : cars) {
    System.out.println(i);
    }
  }
}
