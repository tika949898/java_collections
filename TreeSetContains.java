import java.util.TreeSet;

public class TreeSetContains {
  public static void main(String[] args) {
    TreeSet<String> names = new TreeSet<String>();
    names.add("Prem");
    names.add("Rohit");
    names.add("Rekha");
    names.add("Babblu");
    names.add("Ankita");
    System.out.println(names.contains("Tika"));
  }
}