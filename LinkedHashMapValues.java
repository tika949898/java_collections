import java.util.LinkedHashMap;

public class LinkedHashMapValues {
  public static void main(String[] args) {
    LinkedHashMap<String, String> nameFrom = new LinkedHashMap<>();
    nameFrom.put("Tika", "Dhanbad");
    nameFrom.put("Bhumi", "Chhattisgarh");
    nameFrom.put("Rahul", "Bokaro");
    nameFrom.put("Jitu", "Bokaro");

    for (String i : nameFrom.values()) {
      System.out.println(i);
    }
  }
}