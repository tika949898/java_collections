public class Array2DOverRide {
  public static void main(String[] args) {
    int[][] myNum = {{1, 4, 2}, {3, 6, 8}};
    myNum[1][2] = 9;
    System.out.println("Changed Value: " + myNum[1][2]);
  }
}