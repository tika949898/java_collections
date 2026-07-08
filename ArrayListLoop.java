import java.util.ArrayList;

public class ArrayListLoop {
  public static void main(String[] args) {
    ArrayList<Integer> myNum = new ArrayList<Integer>();
    myNum.add(10);
    myNum.add(15);
    myNum.add(20);
    myNum.add(25);
    myNum.add(30);
    for (int i : myNum) {
      System.out.println(i);
    }
  }
}