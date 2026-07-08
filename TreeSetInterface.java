import java.util.Set;
import java.util.TreeSet;
public class TreeSetInterface {

  public static void main(String[] args) {
    Set<Integer> myNum = new TreeSet<Integer>();
    myNum.add(100);
    myNum.add(204);
    myNum.add(10);
    myNum.add(28);
    myNum.add(12);
    for (int n : myNum) {
      System.out.println(n);
    }
  }
}