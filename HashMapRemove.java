import java.util.HashMap;

public class HashMapRemove {
  public static void main(String[] args) {
    HashMap<String, String> namesFrom = new HashMap<>();
    namesFrom.put("Tikaram", "Dhanbad");
    namesFrom.put("Rahul", "Bokaro");
    namesFrom.put("Nandan", "Jamshedpur");
    namesFrom.put("Anay", "Ranchi");

    namesFrom.remove("Anay");
    System.out.println(namesFrom);
  }
}