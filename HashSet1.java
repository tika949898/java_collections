import java.util.HashSet;

public class HashSet1 {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("BMW");
    cars.add("Safari");
    System.out.println(cars);
  }
}