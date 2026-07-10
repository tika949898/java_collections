import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator1 {
  public static void main(String[] args) {

    // Make a collection
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("Aulto");
    cars.add("Safari");
    cars.add("Farari");

    // Get the iterator
    Iterator<String> it = cars.iterator();
    System.out.println(it.next());
  }
}