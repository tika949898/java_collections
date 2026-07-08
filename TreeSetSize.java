import java.util.TreeSet;

public class TreeSetSize {
  public static void main(String[] args) {
    TreeSet<String> flower = new TreeSet<String>();
    flower.add("Rose");
    flower.add("Lowtus");
    flower.add("Marigold");
    flower.add("Rose");
    System.out.println(flower.size());
  }
}