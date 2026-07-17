public class Annotation2 {
  @Deprecated
  static void oldMethod() {
    System.out.println("This method is outdated.");
  }

  public static void main(String[] args) {
  oldMethod();
  }
}