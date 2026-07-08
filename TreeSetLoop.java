import java.util.TreeSet;

public class TreeSetLoop {
  public static void main(String[] args) {
    TreeSet<String> names = new TreeSet<String>();
    names.add("Sachin");
    names.add("Virendra");
    names.add("Rohit");
    names.add("Sourab");
    for (String i : names) {
      System.out.println(i);
    }
  }
}