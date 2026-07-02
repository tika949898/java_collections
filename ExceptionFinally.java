public class ExceptionFinally {
  public static void main() {
    try {
      int[] myNum = {1, 2, 3};
      System.out.println(myNum[20]);
    }
    catch (Exception e) {
      System.out.println("This is a wrong value");
    }
    finally {
      System.out.println("The 'try and catch' is finished");
    }
  }
}