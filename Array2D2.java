public class Array2D2 {
  public static void main(String[] args) {
    int[][] myNumber = { {1,4,2}, {3, 6, 8, 5 ,9}};
    for (int row = 0; row < myNumber.length; row++) {
      for (col = 0; col < myNumber[row].length; col++) {
        System.out.println("myNumber[" + row + "][" + col + "] = " + myNumber[row][col]);
      }
    }
  }
}