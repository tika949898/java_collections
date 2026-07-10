import java.util.Map;
import java.util.TreeMap;

public class TreeMapInterface {
  public static void main(String[] args) {
    Map<String, String> nameFrom = new TreeMap<>();
    nameFrom.put("Tikaram", "Dhanbad");
    nameFrom.put("Rahul", "Bokaro");
    nameFrom.put("Monika", "Bokaro");
    nameFrom.put("Nandan", "Jamshedpur");

    System.out.println(nameFrom);
  }
}