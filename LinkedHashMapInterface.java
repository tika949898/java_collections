import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapInterface {
  public static void main(String[] args) {
    Map<String, String> nameFrom = new LinkedHashMap<>();
    nameFrom.put("Tika", "Dhanbad");
    nameFrom.put("Bhumi", "Chhattisgarh");
    nameFrom.put("Rahul", "Bokaro");
    nameFrom.put("Jitu", "Bokaro");

    System.out.println(nameFrom);
  }
}