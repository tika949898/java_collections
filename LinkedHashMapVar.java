import java.util.LinkedHashMap;

public class LinkedHashMapVar {
  public static void main(String[] args) {
    var nameFrom = new LinkedHashMap<>();
    nameFrom.put("Tika", "Dhanbad");
    nameFrom.put("Bhumi", "Chhattisgarh");
    nameFrom.put("Rahul", "Bokaro");
    nameFrom.put("Jitu", "Bokaro");

    System.out.println(nameFrom);
  }
}