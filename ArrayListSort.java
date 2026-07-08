import java.util.ArrayList;
import java.util.Collections;

public class  ArrayListSort {

  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();
    names.add("Tikaram");
    names.add("Krishna");
    names.add("Ankita");
    names.add("Gita");
    names.add("Pinki");
    Collections.sort(names);

    for (String i : names) {
      System.out.println(i);
    }
  }
}