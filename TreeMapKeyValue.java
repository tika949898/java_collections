import java.util.TreeMap;

public class TreeMapKeyValue {
  public static void main(String[] args) {
    TreeMap<String, String> nameFrom = new TreeMap<>();
    nameFrom.put("Tikaram", "Dhanbad");
    nameFrom.put("Rahul", "Bokaro");
    nameFrom.put("Monika", "Bokaro");
    nameFrom.put("Nandan", "Jamshedpur");
    for (String i : nameFrom.keySet()) {
    System.out.println("Key: " + i + "Value: " + nameFrom.get(i));
    }
  }
}