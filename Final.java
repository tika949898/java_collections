public class Final {
  final int x = 12;
  final int pi = 3.14;

  public static void main(String[] args) {
    Final obj = new Final();
    obj.x = 24;  // can not change final variable
    obj.pi = 2.22;  // can not change final variable
    System.out.println(obj.x + " " + obj.pi);
  }
}