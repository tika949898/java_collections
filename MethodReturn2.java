public class MethodReturn2 {
  static int myMethod(int x, int y) {
    return x + y;
  }
  public static void main(String[] args) {
    int z = myMethod(50, 100);
    System.out.println(z);
  }

}