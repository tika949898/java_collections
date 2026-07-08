import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("Maruti");
    cars.add("BMW");
    cars.add("Aulto");

        // Get an iterator for the ArrayList
    Iterator<String> it = cars.iterator();

    // Iterate through the list using the iterator
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}