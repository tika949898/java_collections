public class ExceptionExample {
  public static void main(String[] args) {
    try{
      int[] myNum = {1, 2, 3};
      System.out.println(myNum[20]);
    }
    catch(Exception e) {
      System.out.println("Something went wrong;");
    }
  }
}
