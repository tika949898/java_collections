import java.util.HashSet;
public class HashSetSize {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("BMW");
    cars.add("Farari");
    cars.add("Safari");
    cars.add("Maruti");

    System.out.println(cars.size());
  }
}