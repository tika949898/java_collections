import java.util.HashMap;

public class HashMapLoopValue {
  public static void main(String[] args) {
    HashMap<String, String> namesFrom = new HashMap<>();
    namesFrom.put("Tikaram", "Dhanbad");
    namesFrom.put("Rahul", "Bokaro");
    namesFrom.put("Nandan", "Jamshedpur");
    namesFrom.put("Anay", "Ranchi");

    for (String i : namesFrom.values()) {
      System.out.println(i);
    }
  }
}