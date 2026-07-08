import java.util.TreeSet;

public class TreeSetClear {
  public static void main(String[] args) {
    TreeSet<String> names = new TreeSet<String>();
    names.add("Prem");
    names.add("Rohit");
    names.add("Rekha");
    names.add("Babblu");
    names.add("Ankita");

    names.clear();
    System.out.println(names);
  }
}