import java.util.TreeMap;

public class TreeMapVar {
  public static void main(String[] args) {
    var nameFrom = new TreeMap<>();
    nameFrom.put("Tikaram", "Dhanbad");
    nameFrom.put("Rahul", "Bokaro");
    nameFrom.put("Monika", "Bokaro");
    nameFrom.put("Nandan", "Jamshedpur");

    System.out.println(nameFrom);
  }
}