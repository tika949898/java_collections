import java.util.ArrayList;

public class ArrayListAdd {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();
    names.add("Tikaram");
    names.add("Vinod");
    names.add("Sangeeta");
    names.add(0, "Gita");
    System.out.println(names);
    System.out.println(names.get(0));  //Access the elements
    System.out.println(names.set(0,"Rekha")); // change the elements
      System.out.println(names.remove(2));  //remove the elements
    System.out.println(names.size());
    System.out.println(names.clear()); //clear all
  }
}