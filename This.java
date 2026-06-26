public class This {
  int x; // class variable
// constructor parameter
  public This(int x) {
    this.x = x;  //refers to the class variable
  }

  public static void main(String[] args) {
    This obj = new This(10);
    System.out.println(obj.x);
  }
}