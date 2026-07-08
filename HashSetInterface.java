import java.util.Set;
import java.util.HashSet;

public class HashSetInterface {
  public static void main(String[] args) {
    Set<String> names = new HashSet<String>();
    names.add("Gita");
    names.add("Amit");
    names.add("Rohit");
    names.add("Shilpa");
    names.add("Rinki");
    System.out.println(names);
}
}