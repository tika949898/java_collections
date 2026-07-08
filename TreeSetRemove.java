import java.util.TreeSet;

public class TreeSetRemove {
  public static void main(String[] args) {
    TreeSet<String> names = new TreeSet<String>();
    names.add("Prem");
    names.add("Rohit");
    names.add("Rekha");
    names.add("Babblu");
    names.add("Ankita");

    names.remove("Rekha");
    System.out.println(names);
  }
}