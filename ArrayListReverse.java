import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverse {
  public static void main(String[] args) {
    ArrayList<Integer> myNum = new ArrayList<Integer>();
    myNum.add(10);
    myNum.add(21);
    myNum.add(68);
    myNum.add(12);
    myNum.add(45);
    Collections.sort(myNum, Collections.reverseOrder());
    for (int i : myNum) {
      System.out.println(i);
    }
  }
}