import java.util.TreeSet;

public class TreeSet1 {
  public static void main(String[] args) {
    TreeSet<String> cars = new TreeSet<String>();
    cars.add("BMW");
    cars.add("Safari");
    cars.add("Farari");
    cars.add("BMW");
    cars.add("Maruti");
    cars.add("Aulto");
    System.out.println(cars);
  }

}