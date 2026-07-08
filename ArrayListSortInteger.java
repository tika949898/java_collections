import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortInteger {
  public static void main(String[] args) {
    ArrayList<Integer> myNum = new ArrayList<Integer>();
    myNum.add(100);
    myNum.add(90);
    myNum.add(80);
    myNum.add(70);
    myNum.add(60);
    myNum.add(50);
    Collections.sort(myNum);

    for (int i : myNum) {

      System.out.println(i);}
}
}