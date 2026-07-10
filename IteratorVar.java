import java.util.ArrayList;
import java.util.Iterator;

public class IteratorVar {
  public static void main(String[] args) {
    ArrayList<String> name = new ArrayList<String>();
    name.add("Tika");
    name.add("Ankit");
    name.add("Ajay");
    name.add("Rahul");
    name.add("Anay");
    var it=  name.iterator();
    while(it.hasNext()) {
      System.out.println(it.next());
    }
  }
}