import java.util.HashSet;
public class HashSetClear {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("BMW");
    cars.add("Farari");
    cars.add("Safari");
    cars.add("Maruti");

  cars.clear();
    System.out.println(cars);
  }
}