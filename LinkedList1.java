import java.util.LinkedList;

public class LinkedList1 {
  public static void main(String[] args) {
    LinkedList<String> link = new LinkedList<String>();
    link.add("BMW");
    link.add("Volvo");
    link.add("Maruti");
    link.add("");
    link.add("Safari");
    // add first
    link.addFirst("Aulto");
    link.addFirst("BMW");

  System.out.println(link);
  }
}