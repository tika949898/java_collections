import java.util.HashSet;
public class HashSetRemove {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("BMW");
    cars.add("Farari");
    cars.add("Safari");
    cars.add("Maruti");

  cars.remove("Maruti");
    System.out.println(cars);
  }
}