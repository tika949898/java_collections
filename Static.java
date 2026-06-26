public class Static {
 // create static method
  static void staticMethod() {
    System.out.println("This is static method");
  }

// main method
  public static void main(String[] args) {
    staticMethod();  //call the static method
    Static.staticMethod(); // also can using class name
}
}