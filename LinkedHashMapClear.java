import java.util.LinkedHashMap;

public class LinkedHashMapClear {
  public static void main(String[] args) {
    LinkedHashMap<String, String> nameFrom = new LinkedHashMap<>();
    nameFrom.put("Tika", "Dhanbad");
    nameFrom.put("Bhumi", "Chhattisgarh");
    nameFrom.put("Rahul", "Bokaro");
    nameFrom.put("Jitu", "Bokaro");

    nameFrom.clear();
    System.out.println(nameFrom);
  }
}