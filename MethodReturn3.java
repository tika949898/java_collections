public class MethodReturn3 {
  static int multiple(int x) {
    return x * 2;
  }
public static void main(String[] args) {
    for (int i = 1; i < 5; i++) {
      System.out.println(multiple(i));
    }
  }
}