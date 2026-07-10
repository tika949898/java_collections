import java.util.TreeMap;

public class TreeMapValue {
  public static void main(String[] args) {
    TreeMap<String, String> nameFrom = new TreeMap<>();
    nameFrom.put("Tikaram", "Dhanbad");
    nameFrom.put("Rahul", "Bokaro");
    nameFrom.put("Monika", "Bokaro");
    nameFrom.put("Nandan", "Jamshedpur");
    for (String i : nameFrom.values()) {
    System.out.println(i);
    }
  }
}