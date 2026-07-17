import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaVariable {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(23);
    numbers.add(12);
    numbers.add(21);
    numbers.add(32);

    Consumer <Integer> method = (n) -> {
      System.out.println(n);
    };
    numbers.forEach(method);
  }
}
