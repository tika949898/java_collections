public class ConstructorParameter {
  int x;

  public ConstructorParameter(int y) {
    x = y;
  }

  public static void main(String[] args) {
    ConstructorParameter obj = new ConstructorParameter(100);
    System.out.println(obj.x);
  }
}