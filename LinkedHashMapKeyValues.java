import java.util.LinkedHashMap;

public class LinkedHashMapKeyValues {
  public static void main(String[] args) {
    LinkedHashMap<String, String> nameFrom = new LinkedHashMap<>();
    nameFrom.put("Tika", "Dhanbad");
    nameFrom.put("Bhumi", "Chhattisgarh");
    nameFrom.put("Rahul", "Bokaro");
    nameFrom.put("Jitu", "Bokaro");

    for (String i : nameFrom.keySet()) {
      System.out.println("Key: " + i + "Value: " + nameFrom.get(i));
    }
  }
}