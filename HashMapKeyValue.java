import java.util.HashMap;

public class HashMapKeyValue {
  public static void main(String[] args) {
    HashMap<String, String> namesFrom = new HashMap<>();
    namesFrom.put("Tikaram", "Dhanbad");
    namesFrom.put("Rahul", "Bokaro");
    namesFrom.put("Nandan", "Jamshedpur");
    namesFrom.put("Anay", "Ranchi");

    for (String i : namesFrom.keySet()) {
      System.out.println("Key: " + i + "Value:" + namesFrom.get(i));
    }
  }
}