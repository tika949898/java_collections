import java.util.HashSet;

public class HashSetLoop {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Aulto");
    cars.add("BMW");
    cars.add("Maruti");
    cars.add("Safari");
    for (String i : cars) {
      System.out.println(i);
    }
  }
}