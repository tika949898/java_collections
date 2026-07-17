public class GenericMethod {
  public static <T> void printArray(T[] array) {
    for (T item : array) {
      System.out.println(item);
    }
  }
  public static void main(String[] args) {
    String[] name = {"Tikaram", "Mahto"};

    Integer[] number = {1, 2, 3};

    printArray(name);
    printArray(number);
  }
}