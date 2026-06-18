public class MethodIf {
  static void checkAge(int age) {
    if (age < 18) {
      System.out.println("You are not a enough of age!");
    }
    else {
      System.out.println("You are enough age to cast!");
    }
  }
    public static void main(String[] args) {
    checkAge(20);
  }
}