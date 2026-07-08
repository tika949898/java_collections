import java.util.Map;
import java.util.HashMap;

public class HashMapInterface {
  public static void main(String[] args) {
    Map<String, Integer> nameAge = new HashMap<String, Integer>();
    nameAge.put("Rahul", 25);
    nameAge.put("Tika", 26);
    nameAge.put("Nandan", 14);
    nameAge.put("Suraj", 23);
    nameAge.put("Ankit", 12);
    for (String i : nameAge.keySet()) {
      System.out.println("Key: " + i + "Value: " + nameAge.get(i));
    }
  }
}