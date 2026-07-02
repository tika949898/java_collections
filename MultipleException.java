public class MultipleException {
  public static void main(String[] args) {
    try {
      int[] myNum = {1, 2, 3};
      System.out.println(myNum[12]);
      int result = 10 / 0;
    }
    catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("The array does not exist.");
    }
    catch (ArithmeticException e) {
      System.out.println("this number can not divide by 0");
    }
    catch (Exception e) {
      System.out.println("Something went wrong.");
    }
  }
}