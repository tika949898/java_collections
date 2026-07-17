import java.util.ArrayList;


public class LambdaForEach {
  public static void main(String[] args) {
    ArrayList<Integer> number = new ArrayList<>();
    number.add(5);
    number.add(10);
    number.add(15);
    number.add(20);
    number.add(20);

    number.forEach((n) -> { System.out.println(n); });
  }
}