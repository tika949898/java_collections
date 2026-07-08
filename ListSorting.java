import java.util.ArrayList;
import java.util.Collections;

public class ListSorting {

  public static void main(String[] args){
    ArrayList<String> names = new ArrayList<String>();
  names.add("Tikaram");
    names.add("Vinod");
    names.add("Ankit");
    names.add("Chandan");

    Collections.sort(names, Collections.reverseOrder());
for (String i : names) {
      System.out.println(i);
    }
  }
}