import java.util.TreeMap;

public class TreeMapRemove {
  public static void main(String[] args) {
    TreeMap<String, String> nameFrom = new TreeMap<>();
    nameFrom.put("Tikaram", "Dhanbad");
    nameFrom.put("Rahul", "Bokaro");
    nameFrom.put("Monika", "Bokaro");
    nameFrom.put("Nandan", "Jamshedpur");

    nameFrom.remove("Tikaram");

    System.out.println(nameFrom);
  }
}