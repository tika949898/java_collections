import java.util.HashMap;

public class HashMapVar {
  public static void main(String[] args) {
    var nameAge = new HashMap<String, Integer>();
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