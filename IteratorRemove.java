import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemove {
  public static void main(String[] args) {
    ArrayList<Integer> number = new ArrayList<Integer>();
    number.add(5);
    number.add(8);
    number.add(12);
    number.add(15);

    Iterator<Integer> it = number.iterator();
    while(it.hasNext()) {
      Integer i = it.next();
      if (i < 10) {
        it.remove();
      }
    }
    System.out.println(number);
  }
}