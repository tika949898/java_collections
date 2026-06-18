public class MethodOverLoading {
  static int plusMethod(int x, int y) {
  return x + y;
  }
  static double plusMethod(double x, double y) {
    return x + y;
  }
  public static void main(String[] args) {
    int myNum1 = plusMethod(2, 3);
    double myNum2 = plusMethod(5.5, 3.4);
    System.out.println("int: " + myNum1);
    System.out.println("double: " + myNum2);
  }
}