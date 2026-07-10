import java.util.ArrayList;
import java.util.Iterator;

public class IteratorWhile {
  public static void main(String[] args) {
    ArrayList<String> name = new ArrayList<String>();
    name.add("Tika");
    name.add("Rekha");
    name.add("Krishna");
    name.add("Tika");

    //Iteration
    Iterator<String> it = name.iterator();

    //Loop through a collection
    while(it.hasNext()) {
      System.out.println(it.next());
    }
  }
}